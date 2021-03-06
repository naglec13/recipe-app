package guru.springframework.recipeapp.converters;

import com.sun.istack.Nullable;
import guru.springframework.recipeapp.commands.CategoryCommand;
import guru.springframework.recipeapp.domain.Category;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class CategoryToCategoryCommand implements Converter<Category, CategoryCommand> {

    @Synchronized
    @Nullable
    @Override
    public CategoryCommand convert(Category category) {
        if (category != null) {
            final CategoryCommand categoryCommand = new CategoryCommand();
            categoryCommand.setId(category.getId());
            categoryCommand.setDescription(category.getDescription());

            return categoryCommand;
        }

        return null;
    }
}
