package com.xsoft.science.mathparser.factories.exception.impl;

/*
 MathParser Java - Cross Platform Mathematical Expressions Parser
 Copyright 2013 Rodríguez Hernández, Daniel.
 daniel.rguez.hdez[at]gmail.com

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

import com.xsoft.science.mathparser.factories.Factories;

public class InvalidOperatorException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 830529775315876618L;

	InvalidOperatorException() {
		super(Factories.getExceptionMessageFactoryInstance().createInvalidOperatorMessage());
	}
}