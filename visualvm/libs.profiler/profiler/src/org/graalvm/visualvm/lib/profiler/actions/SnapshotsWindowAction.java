/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright 1997-2014 Oracle and/or its affiliates. All rights reserved.
 *
 * Oracle and Java are registered trademarks of Oracle and/or its affiliates.
 * Other names may be trademarks of their respective owners.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common
 * Development and Distribution License("CDDL") (collectively, the
 * "License"). You may not use this file except in compliance with the
 * License. You can obtain a copy of the License at
 * http://www.netbeans.org/cddl-gplv2.html
 * or nbbuild/licenses/CDDL-GPL-2-CP. See the License for the
 * specific language governing permissions and limitations under the
 * License.  When distributing the software, include this License Header
 * Notice in each file and include the License file at
 * nbbuild/licenses/CDDL-GPL-2-CP.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the GPL Version 2 section of the License file that
 * accompanied this code. If applicable, add the following below the
 * License Header, with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 *
 * Contributor(s):
 * The Original Software is NetBeans. The Initial Developer of the Original
 * Software is Sun Microsystems, Inc. Portions Copyright 1997-2006 Sun
 * Microsystems, Inc. All Rights Reserved.
 *
 * If you wish your version of this file to be governed by only the CDDL
 * or only the GPL Version 2, indicate your decision by adding
 * "[Contributor] elects to include this software in this distribution
 * under the [CDDL or GPL Version 2] license." If you do not indicate a
 * single choice of license, a recipient has the option to distribute
 * your version of this file under either the CDDL, the GPL Version 2 or
 * to extend the choice of license to its licensees as provided above.
 * However, if you add GPL Version 2 code and therefore, elected the GPL
 * Version 2 license, then the option applies only if the new code is
 * made subject to such option by the copyright holder.
 */

package org.graalvm.visualvm.lib.profiler.actions;

import org.openide.util.NbBundle;
import java.awt.event.ActionEvent;
import javax.swing.*;
import org.graalvm.visualvm.lib.profiler.api.icons.Icons;
import org.graalvm.visualvm.lib.profiler.api.icons.ProfilerIcons;
import org.graalvm.visualvm.lib.profiler.v2.SnapshotsWindow;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;


/**
 * Action to display the Snapshots window.
 *
 * @author Jiri Sedlacek
 */
@NbBundle.Messages({
    "LBL_SnapshotsWindowAction=&Snapshots",
    "HINT_SnapshotsWindowAction=Show Profiler Snapshots Window"
})
@ActionID(category="Profile", id="org.netbeans.modules.profiles.actions.SnapshotsWindowAction")
@ActionRegistration(displayName="#LBL_SnapshotsWindowAction", iconBase="org/graalvm/visualvm/lib/profiler/impl/icons/takeSnapshot.png")
@ActionReference(path="Menu/Window/Profile", position=99)
public final class SnapshotsWindowAction extends AbstractAction {
    
    public SnapshotsWindowAction() {
        putValue(Action.NAME, Bundle.LBL_SnapshotsWindowAction());
        putValue(Action.SHORT_DESCRIPTION, Bundle.HINT_SnapshotsWindowAction());
        putValue(Action.SMALL_ICON, Icons.getIcon(ProfilerIcons.SNAPSHOT_TAKE));
        putValue("iconBase", Icons.getResource(ProfilerIcons.SNAPSHOT_TAKE));
    }

    
    public void actionPerformed(final ActionEvent e) {
        SnapshotsWindow.instance().showStandalone();
    }
}
