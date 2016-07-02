/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tientx.supercode.bookstore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import tientx.supercode.bookstore.database.SingleDBConnection;
import tientx.supercode.bookstore.model.Book;
import tientx.supercode.bookstore.model.Deals;
import tientx.supercode.bookstore.model.SubCategory;
import tientx.supercode.bookstore.tool.MyTool;

/**
 *
 * @author zOzDarKzOz
 */
public class BookDaoImpl implements BookDao {

    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    public BookDaoImpl() {
        conn = SingleDBConnection.getInstance().getConnection();
    }

    @Override
    public Book getById(Integer id) {
        String sqlSelect = "SELECT "
                + "tblBook.title, "
                + "tblBook.author, "
                + "tblBook.publisher, "
                + "tblBook.publistYear, "
                + "tblBook.coverImg, "
                + "tblBook.description, "
                + "tblBook.originalPrice, "
                + "tblBook.salePrice, "
                + "tblBook.quantity, "
                + "tblBook.vote, "
                + "tblBook.rate, "
                + "tblBook.link, "
                + "tblSubCategory.idSubCt, "
                + "tblSubCategory.name , "
                + "tblSubCategory.description, "
                + "tblSubCategory.link "
                + "FROM tblBook "
                + "JOIN tblSubCategory "
                + "ON tblBook.idSubCt = tblSubCategory.idSubCt "
                + "WHERE tblBook.idBook = " + id;
        try {
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = state.executeQuery(sqlSelect);
            if (rs != null && rs.next()) {
                SubCategory subCategory = new SubCategory(
                        rs.getInt(13), rs.getString(14),
                        rs.getString(15), rs.getString(16)
                );
                List<Deals> listDeals = getDealsById(id);
                return new Book(
                        id, rs.getString(1), rs.getString(2),
                        rs.getString(3), rs.getString(4), rs.getString(5),
                        rs.getString(6), rs.getString(7), rs.getString(8),
                        rs.getInt(9), rs.getInt(10), rs.getInt(11),
                        rs.getString(12), subCategory, listDeals
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public List<Book> getByIdSubCategory(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Book> getBySubCategoryName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Deals> getDealsById(Integer id) {
        String sqlSelect = "SELECT DISTINCT "
                + "tblDeals.idDeals, "
                + "tblDeals.code, "
                + "tblDeals.description, "
                + "tblDeals.discount, "
                + "tblDeals.startDate, "
                + "tblDeals.endDate, "
                + "tblDeals.status "
                + "FROM "
                + "tblDeals "
                + "JOIN tblBookDeals "
                + "ON tblDeals.idDeals = tblBookDeals.idDeals "
                + "WHERE "
                + "tblDeals.idDeals = " + id + ";";
        try {
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = state.executeQuery(sqlSelect);
            if (rs != null) {
                List<Deals> list = new ArrayList<>();
                while (rs.next()) {
                    list.add(new Deals(
                            rs.getInt(1), rs.getString(2), rs.getString(3),
                            rs.getInt(4), rs.getDate(5), rs.getDate(6), rs.getInt(7))
                    );
                }
                return list;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public Integer insert(Book book) {
        String sqlInsert = "INSERT INTO tblBook("
                + "title, "
                + "author, "
                + "publisher, "
                + "publistYear, "
                + "coverImg, "
                + "description, "
                + "originalPrice, "
                + "salePrice, "
                + "quantity, "
                + "vote, "
                + "rate, "
                + "link"
                + ") VALUES(?,?,?,?,?,?,?,?,?,?,?,?);";
        try {
            ps = conn.prepareStatement(sqlInsert);
            ps.setString(1, book.getsTitle());
            ps.setString(2, book.getsAuthor());
            ps.setString(3, book.getsPublisher());
            ps.setString(4, book.getsPublishYear());
            ps.setString(5, book.getsCoverImg());
            ps.setString(6, book.getsDescription());
            ps.setString(7, book.getsOriginalPrice());
            ps.setString(8, book.getsSalePrice());
            ps.setInt(9, book.getiQuantity());
            ps.setInt(10, 0);
            ps.setInt(11, 0);
            ps.setInt(11, 0);
            ps.setString(12, book.getsTitle());

            int numm = ps.executeUpdate();
            if (numm == 1) {
                Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                rs = state.executeQuery("SELECT LAST_INSERT_ID();");
                if (rs != null && rs.next()) {
                    Integer idBook = rs.getInt(1);
                    String sqlUpdate = "UPDATE tblBook "
                            + "SET tblBook.link = ? "
                            + "WHERE tblBook.idBook = ?;";
                    ps = conn.prepareStatement(sqlUpdate);
                    ps.setString(1, MyTool.handleLink(book.getsTitle()));
//                    ps.setString(1, MyTool.handleLink(book.getsTitle(), idBook));
                    ps.setInt(2, idBook);

                    numm = ps.executeUpdate();
                    if (numm == 1) {
                        return idBook;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return -1;
    }

    @Override
    public boolean update(Book book) {
        String sqlUpdate = "UPDATE tblBook SET "
                + "tblBook.title = ?, "
                + "tblBook.author = ?, "
                + "tblBook.publisher = ?, "
                + "tblBook.publistYear = ?, "
                + "tblBook.coverImg = ?, "
                + "tblBook.description = ?, "
                + "tblBook.originalPrice = ?, "
                + "tblBook.salePrice = ?, "
                + "tblBook.quantity = ?, "
                + "tblBook.vote = ?, "
                + "tblBook.rate = ?, "
                + "tblBook.link = ? "
                + "WHERE tblBook.idBook = ?;";
        try {
            ps = conn.prepareStatement(sqlUpdate);
            ps.setString(1, book.getsTitle());
            ps.setString(2, book.getsAuthor());
            ps.setString(3, book.getsPublisher());
            ps.setString(4, book.getsPublishYear());
            ps.setString(5, book.getsCoverImg());
            ps.setString(6, book.getsDescription());
            ps.setString(7, book.getsOriginalPrice());
            ps.setString(8, book.getsSalePrice());
            ps.setInt(9, book.getiQuantity());
            ps.setInt(10, 0);
            ps.setInt(11, 0);
            ps.setInt(11, 0);
            ps.setString(12, MyTool.handleLink(book.getsTitle()));
//            ps.setString(12, MyTool.handleLink(book.getsTitle(), book.getIdBook()));

            int numm = ps.executeUpdate();
            return (numm == 1);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        String sqlDelete = "DELETE FROM tblBook WHERE tblBook.idBook = ?;";
        try {
            ps = conn.prepareStatement(sqlDelete);
            ps.setInt(1, id);

            int numm = ps.executeUpdate();
            return (numm == 1);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

}
