package by.it.academy.enterprise.components;

import org.springframework.stereotype.Component;

@Component
public class NumberTransform {
    private static final Long NUMBER = 1L;
    private Long number;

    public Long transform() {
        return NUMBER + number;
    }

    public Long transform(Long sumNumber, boolean invert) {
        Long result;
        if (sumNumber == null)
            return transform();
        if (invert) {
            result = sumNumber + number;
        } else {
            result = sumNumber + number;
        }

        return result;
    }

    public void setNumber(Long number) {
        if(number != null) {
            this.number = number;
        } else {
            this.number = 0L;
        }
    }
}
