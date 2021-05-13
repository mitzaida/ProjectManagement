package com;

import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.StringUtils;

//@Log4j2
public class SpeechToTextReceived {

    public static TEST log = new TEST();

    public static void main(String[] args) {

        SpeechToTextReceived stt = new SpeechToTextReceived();
        String[] source = STTResources.japanase;
        int fromIndex = 0;
        log.info(".........");
        for (String word : source) {
            fromIndex = stt.injectTranscript(4, fromIndex, word);
        }
        System.out.println("ALL ===>>> " + stt.allInjectedTranscript);
        System.out.println("Fin...");
    }

    public LiveTranscriptionRequest ltRequest = new LiveTranscriptionRequest();
    public StringBuffer allInjectedTranscript = new StringBuffer();
    public String lastTranscript = "";
    private static char[] separators = "はをもにへでがやのねよ。".toCharArray();

    private int injectTranscript(int unstableWords, int fromIndex, String transcript) {
        String stableTranscript = "";
        try {
            if (ltRequest.getIsCompleteTranscriptPush()) {
                // ...
            } else {

                String currentWords = transcript;
                log.debug(ltRequest.getLtRequestId() + "  ## fromIndex      ## " + fromIndex);
                log.debug(ltRequest.getLtRequestId() + "  ## lastTranscript ## " + lastTranscript);
                log.debug(ltRequest.getLtRequestId() + "  ## transcript     ## " + unstableWords + " ## " + transcript);

                for (char separator : separators) {
                    int position = currentWords.lastIndexOf(String.valueOf(separator));
                    if (position > 0 && position > fromIndex) {
                        stableTranscript = currentWords.substring(fromIndex, position);
                        fromIndex = position;
                        break;
                    }
                }

                fromIndex = unstableWords == 0 ? 0 : fromIndex;
                lastTranscript = fromIndex == 0 ? null : transcript;
            }


            if (!StringUtils.isBlank(stableTranscript)) {
                allInjectedTranscript.append(" ").append(stableTranscript);
                log.info(ltRequest.getLtRequestId() + "  ## Injected transcript  ## " + stableTranscript + " ## ");
            }
        } catch (Exception ex) {
            log.info("Exception in injectTranscript ## " + ex.getLocalizedMessage());
            ex.printStackTrace();
        }
        return fromIndex;
    }

}


class TEST {

    public void info(String msg){
        System.out.println(msg);
    }

    public void debug(String msg){
        System.out.println(msg);
    }

}
