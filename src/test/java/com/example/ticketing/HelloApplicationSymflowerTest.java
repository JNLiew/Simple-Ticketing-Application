package com.example.ticketing;

import java.io.IOException;
import javafx.stage.Stage;
import org.junit.jupiter.api.*;

public class HelloApplicationSymflowerTest {
	@Test
	public void main1() {
		String[] args = null; // TODO This is a fallback value due to incomplete analysis.
		HelloApplication.main(args);
	}

	@Test
	public void start2() throws IOException {
		HelloApplication h = null; // TODO This is a fallback value due to incomplete analysis.
		Stage stage = null; // TODO This is a fallback value due to incomplete analysis.
		h.start(stage);
	}
}
