package com.game.model.engine;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

public class TextParser {
    private HashSet<String> verbs;
    private HashSet<String> nouns;
    public TextParser(){
         super();
         populateVerbs();
         populateNouns();

    }

    private void populateNouns() {
        this.nouns = new HashSet();
        nouns.add("NORTH");
        nouns.add("LEAF");
        nouns.add("SOUTH");
        nouns.add("EAST");
        nouns.add("WEST");
        nouns.add("ANT");
        nouns.add("SPIDER");
        nouns.add("BEES");
        nouns.add("FLIES");
        nouns.add("FISH");
        nouns.add("COMBAT");
        nouns.add("GAME");
        nouns.add("FIGHT");
        nouns.add("RUN");

    }

    private void populateVerbs() {
        this.verbs = new HashSet();
        verbs.add("GO");
        verbs.add("EAT");
        verbs.add("TAME");
        verbs.add("HIDE");
        verbs.add("ATTACK");
        verbs.add("HELP");
        verbs.add("START");
        verbs.add("RUN");
    }


    //If we dont get a viable verb and noun then we will pass null.
    public ArrayList<String> parseInput(String unParsedCommand) {
        String[] result;
        result = unParsedCommand.toUpperCase(Locale.ROOT).split(" ");
        ArrayList<String> list = new ArrayList<>();

        for(String str : result){
            if(verbs.contains(str.toUpperCase(Locale.ROOT)) || nouns.contains(str.toUpperCase(Locale.ROOT))){
                list.add(str);
                if(list.size() == 2){
                    return list;
                }
            }
        }
        return null;
    }
}
