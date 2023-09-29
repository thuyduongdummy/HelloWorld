package OCA_SE8.Test5.Multiplier;

import java.sql.SQLException;

interface Multiplier {
    void multiply(int... x) throws SQLException;
}
