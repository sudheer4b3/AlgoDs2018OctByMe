package test;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

import java.util.Set;

@Value
@Builder
@AllArgsConstructor
public class ShipmentClassModel {

    @NonNull
    private VersionedIdentifier id;

    @NonNull
    private Description description;

    private Set<Property> shipmentClassPropertyList;
}
