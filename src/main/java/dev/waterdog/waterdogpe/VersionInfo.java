/*
 * Copyright 2021 WaterdogTEAM
 * Licensed under the GNU General Public License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.waterdog.waterdogpe;

import org.apache.logging.log4j.Level;

public class VersionInfo {

    public static final boolean DEFAULT_DEBUG = true;

    private final String baseVersion = "1.1.3";
    private final String buildVersion = "#build";
    private final int latestProtocolVersion = 465;
    private final String author = "WaterdogTEAM";

    private final String branchName;
    private final String commitId;
    private boolean debug;

    public VersionInfo(String branchName, String commitId, boolean debug) {
        this.branchName = branchName;
        this.commitId = commitId;
        this.debug = debug;
    }

    public static VersionInfo unknown() {
        return new VersionInfo("unknown", "unknown", DEFAULT_DEBUG);
    }

    public String baseVersion() {
        return this.baseVersion;
    }

    public String buildVersion() {
        return this.buildVersion;
    }

    public int latestProtocolVersion() {
        return this.latestProtocolVersion;
    }

    public String author() {
        return this.author;
    }

    public String branchName() {
        return this.branchName;
    }

    public String commitId() {
        return this.commitId;
    }

    public void debug(boolean debug) {
        if (debug) {
            WaterdogPE.setLoggerLevel(Level.DEBUG);
        }
        this.debug = debug;
    }

    public boolean debug() {
        return this.debug;
    }
}
