/*
 * This file is part of the PSL software.
 * Copyright 2011 University of Maryland
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.umd.cs.psl.model.argument;

import edu.umd.cs.psl.model.argument.type.ArgumentType;
import edu.umd.cs.psl.model.argument.type.ArgumentTypes;

public class NumberAttribute implements Attribute {

	private final double number;
	
	public NumberAttribute(double no) {
		number = no;
	}
	
	@Override
	public String toString() {
		return "'" + number + "'";
	}
	
	@Override
	public Double getAttribute() {
		return number;
	}
	
	@Override
	public boolean isGround() {
		return true;
	}
	
	@Override
	public ArgumentType getType() {
		return ArgumentTypes.Number;
	}
	
	@Override
	public int hashCode() {
		return (new Double(number)).hashCode();
	}
	
	@Override
	public boolean equals(Object oth) {
		if (oth==this) return true;
		if (oth==null || !(getClass().isInstance(oth)) ) return false;
		return number==((NumberAttribute)oth).number;  
	}

	
}