package com.kentnek.cdcl.algo.picker;

import com.kentnek.cdcl.model.Assignment;
import com.kentnek.cdcl.model.Clause;

import java.util.ArrayList;

/**
 * A simple implementation of the Variable State Independent Decaying Sum heuristic.
 *
 * @author kentnek
 * @see <a href="https://www.princeton.edu/~chaff/publication/DAC2001v56.pdf"/>
 * <p>
 */

public class VsidsPicker extends TrackingUnassignedVariablesPicker {

    private ArrayList<LiteralScore> scores;

    private class LiteralScore implements Comparable<LiteralScore> {
        int literal;
        float score;

        @Override
        public int compareTo(LiteralScore other) {
            return Float.compare(this.score, other.score);
        }

        LiteralScore(int literalNum) {
            this.literal = 0;
        }
    }

    @Override
    public VariableValue select() {
        return null;
    }

    @Override
    public void attach(Assignment assignment) {
        super.attach(assignment);

        for (int v = 1; v<=assignment.getVariableCount(); v++) {

        }

    }

    @Override
    public void learn(Clause clause) {

    }
}
