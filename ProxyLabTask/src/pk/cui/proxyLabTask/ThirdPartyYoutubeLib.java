package pk.cui.proxyLabTask;

import java.util.HashMap;

public interface ThirdPartyYoutubeLib {
    HashMap<String, Video> popularVideos();

     Video getVideo(String videoId);
}
