package my.interest.lang.tamil.impl.rx.maaththirai;

import my.interest.lang.tamil.impl.FeatureSet;
import my.interest.lang.tamil.internal.api.PatternGenerator;
import tamil.lang.TamilCharacter;

import java.util.Set;

/**
 * <p>
 * </p>
 *
 * @author velsubra
 */
public class SplitKuttuRX implements PatternGenerator {

    public String generate(FeatureSet set) {
        return "(?:${valiyugaravarisai}(?=(?:${idaivelhi}${uyir})))";
    }

    public Set<TamilCharacter> getCharacterSet() {
        return null;
    }


    public String getName() {
        return "பிரிக்கப்பட்ட குற்று";
    }

    public String getDescription() {
        return "உயிரெழுத்துடன் தொடங்கும் சொல்லின் முன்னாலிருக்குஞ்சொல்லின் முடிவிலிருக்கும் குற்றியலுகரம்  ";
    }

}
