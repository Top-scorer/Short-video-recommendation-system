package com.fzb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class LikeVideo { //collectVideo相同封装
    private Integer videoId;
    private String videoUrl;
    private String coverUrl;
    private String videoTitle;
    private String authorUsername;
    private boolean liked;
    private boolean collected;
    private Integer likeCount;
    private Integer collectCount;
}
