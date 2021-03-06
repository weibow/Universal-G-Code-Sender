/*
    Copyright 2018 Will Winder

    This file is part of Universal Gcode Sender (UGS).

    UGS is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    UGS is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with UGS.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.willwinder.universalgcodesender.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Joacim Breiler
 */
public class PositionTest {

    @Test
    public void getPositionInUnitsShouldConvert() {
        Position position = new Position(1.0, 1.0, 1.0, UnitUtils.Units.INCH);

        Position positionInMM = position.getPositionIn(UnitUtils.Units.MM);
        assertEquals(Double.valueOf(25.4),  Double.valueOf(positionInMM.get(Axis.X)));

        Position positionInInches = positionInMM.getPositionIn(UnitUtils.Units.INCH);
        assertEquals(1,  Math.round(positionInInches.get(Axis.X)));
    }
}
