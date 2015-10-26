package tamil.util.regex.impl;

import org.json.JSONObject;
import tamil.lang.api.job.JobContext;
import tamil.util.regex.SimpleMatcher;
import tamil.util.regex.TamilPattern;

import java.util.regex.Matcher;

/**
 * <p>
 * Job implementation to search for Tamil regular Expression.
 * </p>
 *
 * @author velsubra
 */
public class CompiledPatternFinderJob extends SimpleMatcherBasedJob {
    private TamilPattern pattern = null;

    /**
     * constructor for the job
     *
     * @param source  the source text search
     * @param pattern the pattern to be found
     */
    public CompiledPatternFinderJob(String source, TamilPattern pattern, String title) {
        super(source, title);
        this.pattern = pattern;
    }

    @Override
    public SimpleMatcher getMatcher() {
        return new SimpleMatcher0(pattern.matcher(source));
    }

    protected void config(JobContext<JSONObject> context) {
        super.config(context);

    }

    private static class SimpleMatcher0 implements SimpleMatcher {
        private Matcher matcher = null;

        SimpleMatcher0(Matcher matcher) {
            this.matcher = matcher;
        }

        public boolean find() {
            return matcher.find();
        }

        public int start() {
            return matcher.start();
        }

        public int end() {
            return matcher.end();
        }
    }


}
