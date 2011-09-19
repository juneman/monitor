/* Copyright 2009 predic8 GmbH, www.predic8.com

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License. */

package com.predic8.plugin.membrane.dialogs.rule;

import javax.xml.stream.XMLStreamReader;

import org.eclipse.swt.widgets.Shell;

import com.predic8.membrane.core.Router;
import com.predic8.membrane.core.rules.*;

public class ProxyConfigurationEditDialog extends AbstractProxyConfigurationEditDialog {

	public ProxyConfigurationEditDialog(Shell parentShell) {
		super(parentShell);
	}

	@Override
	public String getTitle() {
		return "Edit Proxy Configuration";
	}

	@Override
	protected Rule parseRule(XMLStreamReader reader) throws Exception {
		return (ProxyRule)new ProxyRule(Router.getInstance()).parse(reader);
	}

}
