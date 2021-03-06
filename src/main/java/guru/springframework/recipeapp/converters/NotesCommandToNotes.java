package guru.springframework.recipeapp.converters;

import com.sun.istack.Nullable;
import guru.springframework.recipeapp.commands.NotesCommand;
import guru.springframework.recipeapp.domain.Notes;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class NotesCommandToNotes implements Converter<NotesCommand, Notes> {

    @Synchronized
    @Nullable
    @Override
    public Notes convert(NotesCommand notesCommand) {
        if (notesCommand != null) {
            final Notes notes = new Notes();
            notes.setId(notesCommand.getId());
            notes.setRecipeNotes(notesCommand.getRecipeNotes());

            return notes;
        }
        return null;
    }
}
