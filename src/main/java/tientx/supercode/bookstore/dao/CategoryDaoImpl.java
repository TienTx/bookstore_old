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
import java.util.LinkedHashMap;
import java.util.Map;
import tientx.supercode.bookstore.database.SingleDBConnection;
import tientx.supercode.bookstore.model.Category;
import tientx.supercode.bookstore.model.SubCategory;

/**
 *
 * @author zOzDarKzOz
 */
public class CategoryDaoImpl implements CategoryDao {

    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    public CategoryDaoImpl() {
        conn = SingleDBConnection.getInstance().getConnection();
    }

    @Override
    public Map<String, Map<Integer, SubCategory>> getAll() {
        String sqlSelectCategory = "SELECT "
                + "tblCategory.idCategory, "
                + "tblCategory.name "
                + "FROM tblCategory;";
        ResultSet rs2 = null;
        try {
            Statement state = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = state.executeQuery(sqlSelectCategory);
            if (rs != null) {
                Map<String, Map<Integer, SubCategory>> mapCt = new LinkedHashMap<>();
                while (rs.next()) {
                    Integer idCt = rs.getInt(1);
                    Statement state2 = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                    rs2 = state2.executeQuery("SELECT "
                            + "tblSubCategory.idSubCt, "
                            + "tblSubCategory.name, "
                            + "tblSubCategory.description, "
                            + "tblSubCategory.link "
                            + "FROM tblSubCategory "
                            + "WHERE tblSubCategory.idCategory = " + idCt + ";");
                    if (rs2 != null) {
                        Map<Integer, SubCategory> mapSubCt = new LinkedHashMap<>();
                        while (rs2.next()) {
                            SubCategory subCt = new SubCategory(rs2.getInt(1), rs2.getString(2), rs2.getString(3), rs2.getString(4));
                            mapSubCt.put(rs2.getInt(1), subCt);
                        }
                        mapCt.put(rs.getString(2), mapSubCt);
                    }
                }
                return mapCt;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (rs2 != null) {
                    rs2.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public Integer insertCategory(Category ct) {
        return -1;
    }

    @Override
    public Integer insertSubCategory(SubCategory subCt) {
        return -1;
    }

    @Override
    public boolean updateCategory(Category ct) {
        return false;
    }

    @Override
    public boolean updateSubCategory(SubCategory subCt) {
        return false;
    }

    @Override
    public boolean deleteCategory(Integer id) {
        return false;
    }

    @Override
    public boolean deleteSubCategory(Integer id) {
        return false;
    }
}
