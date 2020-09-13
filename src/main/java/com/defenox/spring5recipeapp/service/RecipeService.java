package com.defenox.spring5recipeapp.service;

import com.defenox.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
