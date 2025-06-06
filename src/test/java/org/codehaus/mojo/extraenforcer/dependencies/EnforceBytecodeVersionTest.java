/*
 * Copyright 2014 Codehaus.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.codehaus.mojo.extraenforcer.dependencies;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnforceBytecodeVersionTest {

    @Test
    public void renderVersion() {
        assertEquals("JDK 1.5", EnforceBytecodeVersion.renderVersion(49, 0));
        assertEquals("JDK 1.7", EnforceBytecodeVersion.renderVersion(51, 0));
        assertEquals("JDK 11", EnforceBytecodeVersion.renderVersion(55, 0));
        assertEquals("JDK 12", EnforceBytecodeVersion.renderVersion(56, 0));
        assertEquals("51.3", EnforceBytecodeVersion.renderVersion(51, 3));
        assertEquals("44.0", EnforceBytecodeVersion.renderVersion(44, 0));
        assertEquals("JDK 21", EnforceBytecodeVersion.renderVersion(65, 0));
        assertEquals("JDK 22", EnforceBytecodeVersion.renderVersion(66, 0));
        assertEquals("JDK 23", EnforceBytecodeVersion.renderVersion(67, 0));
        assertEquals("JDK 24", EnforceBytecodeVersion.renderVersion(68, 0));
        assertEquals("JDK 25", EnforceBytecodeVersion.renderVersion(69, 0));
    }
}
