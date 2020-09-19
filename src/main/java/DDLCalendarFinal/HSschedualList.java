package DDLCalendarFinal;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;

import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.util.DateTime;
import com.google.api.services.calendar.Calendar;
import com.google.api.services.calendar.model.Event;
import com.google.api.services.calendar.model.Events;

public class HSschedualList {

	private static Calendar service;

	public static Calendar serviceCalendar() throws GeneralSecurityException, IOException {
		final NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
		Calendar cal = new Calendar.Builder(HTTP_TRANSPORT, googleOath.getJSON_FACTORY(),
				googleOath.getCredentials(HTTP_TRANSPORT)).setApplicationName(googleOath.getAPPLICATION_NAME()).build();
		service = cal;
		return service;
	}

	public static List<Event> getHSSchedual() throws IOException, GeneralSecurityException {

		DateTime start = new DateTime(System.currentTimeMillis());
		DateTime end = new DateTime("2021-01-15T16:39:57+03:00");
		String CalID = "isk.ac.ke_a156g0rub49gp5oiribdta23c4@group.calendar.google.com";
		try {
			Events events = service.events().list(CalID).setTimeMin(start).setTimeMax(end).execute();
			List<Event> items = events.getItems();
			for (int i = 0; i < items.size(); i++) {
				//System.out.println(items.get(i).getSummary().length() + ", " + i + ", " + items.get(i).getSummary());
				try {
				if (items.get(i).getSummary().length() > 4) {
					items.remove(i);
					i--;
				}
				}
				catch (NullPointerException e) {
					i++;
				}
			}
			return items;
		} catch (IOException e) {
			new GUIFail();
			return null;
		}
		

	}

}
