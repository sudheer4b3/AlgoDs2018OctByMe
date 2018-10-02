package test;

import lombok.*;

import java.util.Set;


@Value
@Builder
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class CreateShipmentClassRequestModel {

    @NonNull
    private Identifier id;

    @NonNull
    private Description description;

    private Set<Property> shipmentClassPropertyList;



}
