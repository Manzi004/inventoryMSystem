package com.manzicoding2024.inventoryms_springboot_api.services;

//import com.kindson.inventoryappspringbootapi.models.SubCategory;
//import com.kindson.inventoryappspringbootapi.repositories.SubCategoryRepository;
import com.manzicoding2024.inventoryms_springboot_api.models.SubCategory;
import com.manzicoding2024.inventoryms_springboot_api.repositories.SubCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubCategoryService {

    private SubCategoryRepository subCategoryRepository;

    @Autowired
    public SubCategoryService(SubCategoryRepository subCategoryRepository) {
        this.subCategoryRepository = subCategoryRepository;
    }

    public List<SubCategory> getAllSubCategories(){
        return subCategoryRepository.findAll();
    }

    public SubCategory getSubCategoryById(Long id) {
        return subCategoryRepository.findById(id).orElse(null);
    }

    public SubCategory save(SubCategory subCategory) {
        return subCategoryRepository.save(subCategory);
    }

    public void deleteSubCategory(Long id){
        subCategoryRepository.deleteById(id);
    }
}
