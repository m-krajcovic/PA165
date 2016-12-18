package cz.muni.pa165.pneuservis.service.config.dozerCustomConverters;

import org.dozer.CustomConverter;

/**
 * @author Martin Spisiak <spisiak@mail.muni.cz> on 18/12/2016.
 */
public class EnumConverter implements CustomConverter {
    @Override
    public Object convert(Object existingDestinationFieldValue, Object sourceFieldValue,
                          Class<?> destinationClass, Class<?> sourceClass) {

        if (!destinationClass.isEnum()) {
            throw new IllegalArgumentException("destinationClass must be an enum");
        }
        if (!sourceClass.isEnum()) {
            throw new IllegalArgumentException("sourceClass must be an enum");
        }

        Enum<?> sourceValue = (Enum<?>) sourceFieldValue;
        Object[] values = destinationClass.getEnumConstants();
        for (Object value : values) {
            Enum<?> enumValue = (Enum<?>) value;
            if (enumValue.name().equals(sourceValue.name())) {
                return enumValue;
            }
        }
        throw new IllegalArgumentException("Enum constant [" + sourceValue + "] not found in "
                + destinationClass);
    }
}
