/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tientx.supercode.bookstore.service;

import java.util.Map;
import tientx.supercode.bookstore.dao.CategoryDao;
import tientx.supercode.bookstore.dao.CategoryDaoImpl;
import tientx.supercode.bookstore.model.Category;
import tientx.supercode.bookstore.model.SubCategory;

/**
 *
 * @author zOzDarKzOz
 */
public class CategoryServiceImpl implements CategoryService {

    private final CategoryDao ctDao;

    public CategoryServiceImpl() {
        this.ctDao = new CategoryDaoImpl();
    }

    @Override
    public Map<String, Map<Integer, SubCategory>> findAll() {
        return ctDao.getAll();
    }

    @Override
    public Integer addCategory(Category ct) {
        return ctDao.insertCategory(ct);
    }

    @Override
    public Integer addSubCategory(SubCategory subCt) {
        return ctDao.insertSubCategory(subCt);
    }

    @Override
    public boolean editCategory(Category ct) {
        return ctDao.updateCategory(ct);
    }

    @Override
    public boolean editSubCategory(SubCategory subCt) {
        return ctDao.updateSubCategory(subCt);
    }

    @Override
    public boolean deleteCategory(Integer id) {
        return ctDao.deleteCategory(id);
    }

    @Override
    public boolean deleteSubCategory(Integer id) {
        return ctDao.deleteSubCategory(id);
    }
}
