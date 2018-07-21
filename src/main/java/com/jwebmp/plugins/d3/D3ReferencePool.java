/*
 * Copyright (C) 2017 Marc Magon
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

import com.jwebmp.core.base.references.JavascriptReference;

/**
 * @author Marc Magon
 * @version 1.0
 * @since 29 Aug 2015
 */
public enum D3ReferencePool
{

	D3(new JavascriptReference("d3", 1.0, "bower_components/d3/d3.min.js")),
	D3Layout(new JavascriptReference("d3Layout", 1.0, "d3custom/d3.layout.js")),
	;

	private final JavascriptReference reference;

	D3ReferencePool(JavascriptReference reference)
	{
		this.reference = reference;

	}

	/**
	 * Returns the reference for this tree
	 * <p>
	 *
	 * @return
	 */
	public JavascriptReference getReference()
	{
		return reference;
	}

}
