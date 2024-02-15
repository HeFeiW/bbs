package com.hefei.bbs.bbs.provider;

import com.hefei.bbs.bbs.dto.AccessTokenDTO;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import org.springframework.stereotype.Component;

@Component
public class GithubProvider {
    public String gatAccessToken(AccessTokenDTO accessTokenDTO){
        public static final MediaType JSON = MediaType.get("application/json");

        OkHttpClient client = new OkHttpClient();

        String post(String url, String json) throws IOException {
            RequestBody body = RequestBody.create(json, JSON);
            Request request = new Request.Builder()
                    .url(url)
                    .post(body)
                    .build();
            try (Response response = client.newCall(request).execute()) {
                return response.body().string();
            }
        }
    }
}
