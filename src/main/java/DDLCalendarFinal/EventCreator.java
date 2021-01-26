package DDLCalendarFinal;

import java.io.IOException;
import java.util.List;

import com.google.api.client.util.DateTime;
import com.google.api.services.calendar.Calendar;
import com.google.api.services.calendar.model.Event;
import com.google.api.services.calendar.model.EventDateTime;

public class EventCreator {

	private String[] classes;
	private Calendar service;
	private com.google.api.services.calendar.model.Calendar newCal;

	public EventCreator(String[] classes, Calendar service) throws IOException {
		this.classes = classes;
		this.service = service;
		com.google.api.services.calendar.model.Calendar calendar = new com.google.api.services.calendar.model.Calendar();
		calendar.setSummary("Classes");
		calendar.setTimeZone("Africa/Nairobi");
		newCal = service.calendars().insert(calendar).execute();
	}

	public void classEvents(List<Event> items) throws IOException {
		String order;
		DateTime date;
		for (int i = 0; i < items.size(); i++) {
			order = items.get(i).getSummary();
			try {
				date = items.get(i).getStart().getDate();
				if (date == null) {
					i++;
					date = items.get(i).getStart().getDate();
				}
				//System.out.println("date: " + date);

				EventDateTime BLOCK1START = new EventDateTime().setDateTime(new DateTime(date + "T09:40:00+03:00"));
				EventDateTime BLOCK2START = new EventDateTime().setDateTime(new DateTime(date + "T10:55:00+03:00"));
				EventDateTime BLOCK3START = new EventDateTime().setDateTime(new DateTime(date + "T12:10:00+03:00"));
				EventDateTime BLOCK4START = new EventDateTime().setDateTime(new DateTime(date + "T13:55:00+03:00"));
				EventDateTime BLOCK1END = new EventDateTime().setDateTime(new DateTime(date + "T10:45:00+03:00"));
				EventDateTime BLOCK2END = new EventDateTime().setDateTime(new DateTime(date + "T12:00:00+03:00"));
				EventDateTime BLOCK3END = new EventDateTime().setDateTime(new DateTime(date + "T13:15:00+03:00"));
				EventDateTime BLOCK4END = new EventDateTime().setDateTime(new DateTime(date + "T15:00:00+03:00"));
				if (date.toString().equalsIgnoreCase("2021-01-27") || date.toString().equalsIgnoreCase("2020-11-11")
						|| date.toString().equalsIgnoreCase("2021-02-03")
						|| date.toString().equalsIgnoreCase("2021-02-10")
						|| date.toString().equalsIgnoreCase("2021-02-17")
						|| date.toString().equalsIgnoreCase("2021-02-24")
						|| date.toString().equalsIgnoreCase("2021-03-03")
						|| date.toString().equalsIgnoreCase("2021-03-03")
						|| date.toString().equalsIgnoreCase("2021-03-10")
						|| date.toString().equalsIgnoreCase("2021-03-17")
						|| date.toString().equalsIgnoreCase("2021-03-24")
						|| date.toString().equalsIgnoreCase("2021-03-31")
						|| date.toString().equalsIgnoreCase("2021-04-07")
						|| date.toString().equalsIgnoreCase("2021-04-14")
						|| date.toString().equalsIgnoreCase("2021-04-21")
						|| date.toString().equalsIgnoreCase("2021-04-28")
						|| date.toString().equalsIgnoreCase("2021-05-05")
						|| date.toString().equalsIgnoreCase("2021-05-12")
						|| date.toString().equalsIgnoreCase("2021-05-19")
						|| date.toString().equalsIgnoreCase("2021-05-26")
						|| date.toString().equalsIgnoreCase("2021-06-02")
						|| date.toString().equalsIgnoreCase("2021-06-09")){
					BLOCK1START = new EventDateTime().setDateTime(new DateTime(date + "T08:20:00+03:00"));
					BLOCK2START = new EventDateTime().setDateTime(new DateTime(date + "T09:35:00+03:00"));
					BLOCK3START = new EventDateTime().setDateTime(new DateTime(date + "T10:50:00+03:00"));
					BLOCK4START = new EventDateTime().setDateTime(new DateTime(date + "T12:25:00+03:00"));
					BLOCK1END = new EventDateTime().setDateTime(new DateTime(date + "T09:25:00+03:00"));
					BLOCK2END = new EventDateTime().setDateTime(new DateTime(date + "T10:40:00+03:00"));
					BLOCK3END = new EventDateTime().setDateTime(new DateTime(date + "T11:50:00+03:00"));
					BLOCK4END = new EventDateTime().setDateTime(new DateTime(date + "T13:25:00+03:00"));
				}
				switch (order.substring(0, 1)) {
				case "1":
					this.addEvent(BLOCK1START, classes[0], BLOCK1END);
					break;
				case "2":
					this.addEvent(BLOCK1START, classes[1], BLOCK1END);
					break;
				case "3":
					this.addEvent(BLOCK1START, classes[2], BLOCK1END);
					break;
				case "4":
					this.addEvent(BLOCK1START, classes[3], BLOCK1END);
					break;
				case "5":
					this.addEvent(BLOCK1START, classes[4], BLOCK1END);
					break;
				case "6":
					this.addEvent(BLOCK1START, classes[5], BLOCK1END);
					break;
				case "7":
					this.addEvent(BLOCK1START, classes[6], BLOCK1END);
					break;
				case "8":
					this.addEvent(BLOCK1START, classes[7], BLOCK1END);
					break;
				}
				switch (order.substring(1, 2)) {
				case "1":
					this.addEvent(BLOCK2START, classes[0], BLOCK2END);
					break;
				case "2":
					this.addEvent(BLOCK2START, classes[1], BLOCK2END);
					break;
				case "3":
					this.addEvent(BLOCK2START, classes[2], BLOCK2END);
					break;
				case "4":
					this.addEvent(BLOCK2START, classes[3], BLOCK2END);
					break;
				case "5":
					this.addEvent(BLOCK2START, classes[4], BLOCK2END);
					break;
				case "6":
					this.addEvent(BLOCK2START, classes[5], BLOCK2END);
					break;
				case "7":
					this.addEvent(BLOCK2START, classes[6], BLOCK2END);
					break;
				case "8":
					this.addEvent(BLOCK2START, classes[7], BLOCK2END);
					break;
				}
				switch (order.substring(2, 3)) {
				case "1":
					this.addEvent(BLOCK3START, classes[0], BLOCK3END);
					break;
				case "2":
					this.addEvent(BLOCK3START, classes[1], BLOCK3END);
					break;
				case "3":
					this.addEvent(BLOCK3START, classes[2], BLOCK3END);
					break;
				case "4":
					this.addEvent(BLOCK3START, classes[3], BLOCK3END);
					break;
				case "5":
					this.addEvent(BLOCK3START, classes[4], BLOCK3END);
					break;
				case "6":
					this.addEvent(BLOCK3START, classes[5], BLOCK3END);
					break;
				case "7":
					this.addEvent(BLOCK3START, classes[6], BLOCK3END);
					break;
				case "8":
					this.addEvent(BLOCK3START, classes[7], BLOCK3END);
					break;
				}
				switch (order.substring(3)) {
				case "1":
					this.addEvent(BLOCK4START, classes[0], BLOCK4END);
					break;
				case "2":
					this.addEvent(BLOCK4START, classes[1], BLOCK4END);
					break;
				case "3":
					this.addEvent(BLOCK4START, classes[2], BLOCK4END);
					break;
				case "4":
					this.addEvent(BLOCK4START, classes[3], BLOCK4END);
					break;
				case "5":
					this.addEvent(BLOCK4START, classes[4], BLOCK4END);
					break;
				case "6":
					this.addEvent(BLOCK4START, classes[5], BLOCK4END);
					break;
				case "7":
					this.addEvent(BLOCK4START, classes[6], BLOCK4END);
					break;
				case "8":
					this.addEvent(BLOCK4START, classes[7], BLOCK4END);
					break;
				}
			} catch (NullPointerException e) {
				i++;
			}

		}

	}

	private void addEvent(EventDateTime start, String clas, EventDateTime end) throws IOException {
		if (!clas.equalsIgnoreCase("") && clas != null) {
			service.events().insert(newCal.getId(), new Event().setSummary(clas).setStart(start).setEnd(end)).execute();
			wait(250);
		}
	}

	public static void wait(int ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}

}
