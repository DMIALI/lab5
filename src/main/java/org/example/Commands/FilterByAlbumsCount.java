package org.example.Commands;

import java.util.ArrayList;

public class FilterByAlbumsCount extends Command {

    public FilterByAlbumsCount () {
        super("вывести элементы, значение поля albumsCount которых равно заданном");
    }

    @Override
    public String execute(ArrayList<String> args){
        return "FilterByAlbumsCount...";
    }
}