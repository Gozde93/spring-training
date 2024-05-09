package stereotype_annotations.model;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
public class ExtraHours {

    public int extraHours(){
        return 10;
    }
}
