package com.t1t1.sheng;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class EventTextFinderTest {
	
	private EventTextFinder eventTextFinder;

	@Before
	public void setUp() throws Exception {
		eventTextFinder = new EventTextFinder();
	}

	@Test
	public void testMain() throws Exception {
		assertThat(eventTextFinder.execute(), is("[파격세일!!], 50%"));
	}
	
	@Test
	public void testIsContainSpecialChar() throws Exception {
		assertThat(eventTextFinder.isContainSpecialChar("[파격세일!!]"), is(true));
		assertThat(eventTextFinder.isContainSpecialChar("파격세일파격세일"), is(false));
	}

}
