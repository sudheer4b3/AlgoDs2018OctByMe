package test;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

@Value
@Builder
@AllArgsConstructor
public class Property {

    @NonNull
    private String id;

    private String value;

    @NonNull
    private String dataType;

    @NonNull
    private Boolean isRequired;
}
