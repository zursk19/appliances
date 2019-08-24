package pl.sellions.appliance.enums;

public enum ApplianceCategory {
    FRIDGE("FRIDGE"),
    TV("TV"),
    COMPUTER("COMPUTER"),
    MICROWAVE("MICROWAVE");

    String value;

    ApplianceCategory(String value){
        this.value=value;
    }
}
