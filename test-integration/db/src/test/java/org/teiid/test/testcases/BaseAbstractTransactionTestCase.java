package org.teiid.test.testcases;

import junit.framework.TestCase;

import org.teiid.test.framework.ConfigPropertyLoader;
import org.teiid.test.framework.TransactionContainer;
import org.teiid.test.framework.exception.TransactionRuntimeException;

public abstract class BaseAbstractTransactionTestCase extends TestCase {
 
    protected ConfigPropertyLoader config = null;
    protected TransactionContainer container = null;
    protected boolean setupData = true;

    public BaseAbstractTransactionTestCase(String name) {
	super(name);

	
    }
        
    protected abstract TransactionContainer getTransactionContainter();


    protected ConfigPropertyLoader getConfig() {
	return this.config;
    }

    protected void addProperty(String key, String value) {
	if (config == null) {
	    try {
		setUp();
	    } catch (Exception e) {
		// TODO Auto-generated catch block
		throw new TransactionRuntimeException(e);
	    }
	}
	config.setProperty(key, value);
    }



}
