package test;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;


@Value
@Builder
@AllArgsConstructor
public class Identifier {

    @NonNull
    private String value;
}
