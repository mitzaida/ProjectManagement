package com;


import lombok.Data;

import java.util.Date;

@Data
public class LiveTranscriptionRequest {
    private Long ltRequestId = 0L;
    private Long eventId;
    private String serverHostName;
    private String applicationName;
    private String streamName;
    private Boolean isPrimaryStream;
    private String liveStreamAction;
    private String status;
    private Date requestTimestamp;
    private Date updateTimestamp;
    private Date publishTimestamp;
    private String eventLanguageCd;
    private String targetLanguageCd;
    private Boolean isCompleteTranscriptPush = false;

}
