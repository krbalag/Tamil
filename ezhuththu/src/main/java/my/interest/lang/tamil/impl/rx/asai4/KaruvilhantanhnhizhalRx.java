package my.interest.lang.tamil.impl.rx.asai4;

import my.interest.lang.tamil.impl.FeatureSet;
import my.interest.lang.tamil.impl.yaappu.YaappuBaseRx;

/**
 * <p>
 * </p>
 *
 * @author velsubra
 */
public class KaruvilhantanhnhizhalRx extends YaappuBaseRx {

    public KaruvilhantanhnhizhalRx() {
        super("கருவிளந்தண்ணிழல்");
    }
    public String generate(FeatureSet featureSet) {
        return  "(?:(?:${ntirai}){2}${ntear}${ntirai})";

    }
}