package test;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.Value;
import lombok.experimental.Wither;

import java.util.Set;

@Value
public class ShipmentClass  {

    @NonNull
    private final Identifier id;

    @NonNull
    private final Description description;

    @Wither
    private final Set<Property> shipmentClassPropertyList;


    @Builder
    public ShipmentClass(final Identifier id, final Description description,
                                      final Set<Property> shipmentClassPropertyList) {
        this.id = id;
        this.description = description;
        this.shipmentClassPropertyList = shipmentClassPropertyList;

    }
}