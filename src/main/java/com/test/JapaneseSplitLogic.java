package com.test;

import java.text.BreakIterator;
import java.util.Locale;

public class JapaneseSplitLogic {


    public static void main(String[] args) {
//        String TEXT2 = "こんにちは。私の名前はオバマです。私はアメリカに行く。";
        String TEXT = "話をしています二人はどこで会いますかじゃあ明日の12時に会えますかはいどこで会いましょうか小学校の前のレストランはどうですかちょっと駅から遠いですね駅の南口のカフェはどうですかわかりました";
        BreakIterator boundary = BreakIterator.getSentenceInstance(Locale.JAPAN);
        boundary.setText(TEXT);
        int start = boundary.first();
        for (int end = boundary.next();
             end != BreakIterator.DONE;
             start = end, end = boundary.next()) {
            System.out.println(TEXT.substring(start, end));
        }
    }
}
