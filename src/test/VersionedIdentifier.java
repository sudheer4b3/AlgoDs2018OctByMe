package test;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;


@Value
@Builder
@AllArgsConstructor
public class VersionedIdentifier {

    @NonNull
    private Identifier id;

    private Long version;


}
