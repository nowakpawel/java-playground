package pl.pawel.demo.retrofit;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.annotation.Nullable;

@Getter
@RequiredArgsConstructor
public class GitHubRepo {

    @JsonProperty
    @Nullable
    private Integer id;

    @JsonProperty
    private String name;

    @JsonProperty
    private String description;

}
