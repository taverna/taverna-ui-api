/*******************************************************************************
 * Copyright (C) 2011 The University of Manchester
 *
 *  Modifications to the initial code base are copyright of their
 *  respective authors, or their employers as appropriate.
 *
 *  This program is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public License
 *  as published by the Free Software Foundation; either version 2.1 of
 *  the License, or (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful, but
 *  WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with this program; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307
 ******************************************************************************/
package net.sf.taverna.t2.workbench.configuration.colour;

import java.awt.Color;

import net.sf.taverna.t2.workbench.configuration.Configurable;

/**
 *
 *
 * @author David Withers
 */
public interface ColourManager extends Configurable {

	/**
	 * Builds a Color that has been configured and associated with the given String (usually an object type).
	 *
	 * @return the associated Color, or if nothing is associated returns WHITE
	 *
	 */
	public Color getPreferredColour(String itemKey);

	public void setPreferredColour(String itemKey, Color colour);

}