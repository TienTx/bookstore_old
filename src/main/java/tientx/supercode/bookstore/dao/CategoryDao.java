/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tientx.supercode.bookstore.dao;

import java.util.Map;
import tientx.supercode.bookstore.model.Category;
import tientx.supercode.bookstore.model.SubCategory;

/**
 *
 * @author zOzDarKzOz
 */
public interface CategoryDao {

    public Map<String, Map<Integer, SubCategory>> getAll();

    public Integer insertCategory(Category ct);

    public Integer insertSubCategory(SubCategory subCt);

    public boolean updateCategory(Category ct);

    public boolean updateSubCategory(SubCategory subCt);

    public boolean deleteCategory(Integer id);

    public boolean deleteSubCategory(Integer id);
}
