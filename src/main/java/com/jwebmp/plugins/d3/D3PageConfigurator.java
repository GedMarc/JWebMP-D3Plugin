/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.d3;

import com.jwebmp.core.Page;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.services.IPageConfigurator;

import jakarta.validation.constraints.NotNull;

/**
 * @author GedMarc
 */
@PluginInformation(pluginName = "D3 Graphing",
		pluginUniqueName = "d3",
		pluginDescription =
				"D3.js is a JavaScript library for manipulating documents based on data. D3 helps you bring data to life using HTML, SVG, and CSS. D3’s emphasis on web standards gives " +
						"you the full capabilities of modern browsers without tying yourself to a proprietary framework, combining powerful visualization components and a data-driven " +
						"approach to DOM manipulation. ",
		pluginVersion = "1.4.1",
		pluginDependancyUniqueIDs = "jquery",
		pluginCategories = "d3, graphing, reports, graphs",
		pluginSubtitle = "Create stunning graphs using the D3 toolkit.",
		pluginGitUrl = "https://github.com/GedMarc/JWebMP-D3Plugin",
		pluginSourceUrl = "https://github.com/d3/d3",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-D3Plugin/wiki",
		pluginOriginalHomepage = "https://d3js.org/",
		pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins.graphing/jwebmp-d3",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginLastUpdatedDate = "2017/03/04",
		pluginGroupId = "com.jwebmp.plugins.graphing",
		pluginArtifactId = "jwebmp-d3",
		pluginModuleName = "com.jwebmp.plugins.d3",
		pluginStatus = PluginStatus.BaseCompleted
		
)
public class D3PageConfigurator
		implements IPageConfigurator<D3PageConfigurator>
{
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;
	
	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return D3PageConfigurator.enabled;
	}
	
	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		D3PageConfigurator.enabled = mustEnable;
	}
	
	@NotNull
	@Override
	 public Page<?> configure(Page<?> page)
	{
		if (!page.isConfigured() && enabled())
		{
			page.getBody()
			    .addJavaScriptReference(D3ReferencePool.D3.getReference());
		}
		return page;
	}
	
	@Override
	public boolean enabled()
	{
		return D3PageConfigurator.enabled;
	}
	
}
