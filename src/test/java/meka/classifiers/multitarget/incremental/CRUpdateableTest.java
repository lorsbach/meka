/*
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/*
 * Copyright (C) 2020 University of Waikato, Hamilton, New Zealand
 */

package meka.classifiers.multitarget.incremental;

import junit.framework.Test;
import junit.framework.TestSuite;
import meka.classifiers.multilabel.AbstractMultiLabelClassifierTest;
import weka.classifiers.Classifier;

/**
 * Tests CRUpdateable. Run from the command line with:<p/>
 * java meka.classifiers.multilabel.CRUpdateableTest
 *
 * @author FracPete (fracpete at waikato dot ac dot nz)
 */
public class CRUpdateableTest 
  extends AbstractMultiLabelClassifierTest {

  /**
   * Initializes the test.
   * 
   * @param name the name of the test
   */
  public CRUpdateableTest(String name) { 
    super(name);  
  }

  /** 
   * Creates a default CRUpdateable.
   * 
   * @return the classifier
   */
  @Override
  public Classifier getClassifier() {
    return new CRUpdateable();
  }

  public static Test suite() {
    return new TestSuite(CRUpdateableTest.class);
  }

  public static void main(String[] args){
    junit.textui.TestRunner.run(suite());
  }
}