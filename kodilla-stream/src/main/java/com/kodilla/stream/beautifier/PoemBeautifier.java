package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String textToDecore,String ABC,PoemDecorator poemDecorator){
        String deco = poemDecorator.decorate(textToDecore,ABC);
        System.out.println(deco);

    }
}
