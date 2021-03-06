/*
 * Copyright (c) 2012-2018 Red Hat, Inc.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */
package org.eclipse.che.ide.machine.chooser;

import java.util.List;
import org.eclipse.che.ide.api.mvp.View;
import org.eclipse.che.ide.api.workspace.model.MachineImpl;

/**
 * Contract for the view of the machine chooser.
 *
 * @author Artem Zatsarynnyi
 */
public interface MachineChooserView extends View<MachineChooserView.ActionDelegate> {

  /** Show the view. */
  void show();

  /** Close the view. */
  void close();

  /** Sets the machines to display in the view. */
  void setMachines(List<? extends MachineImpl> machines);

  /** The action delegate for this view. */
  interface ActionDelegate {

    /** Called when machine is selected. */
    void onMachineSelected(MachineImpl machine);

    /** Called when machine selection has been canceled. Note that view will be already closed. */
    void onCanceled();
  }
}
