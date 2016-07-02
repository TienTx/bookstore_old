/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tientx.supercode.bookstore.service;

import java.util.Map;
import tientx.supercode.bookstore.model.Category;
import tientx.supercode.bookstore.model.SubCategory;

/**
 *
 * @author zOzDarKzOz
 */
public interface CategoryService {

    public Map<String, Map<Integer, SubCategory>> findAll();

    public Integer addCategory(Category ct);

    public Integer addSubCategory(SubCategory subCt);

    public boolean editCategory(Category ct);

    public boolean editSubCategory(SubCategory subCt);

    public boolean deleteCategory(Integer id);

    public boolean deleteSubCategory(Integer id);
}
