package test;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;


@Value
@Builder
@AllArgsConstructor
public class Description {

    @NonNull
    private String value;
}
