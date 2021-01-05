/*
 * zxcv.java
 *
 * Created on __DATE__, __TIME__
 */

package modelview;

import java.util.Random;

import javax.swing.JOptionPane;


/**
 * 
 * @author __USER__
 */
public class Map1SView extends javax.swing.JFrame {
	LoginView l = new LoginView();
	public int x1 = 106;
	public int y1 = 120;
	public int x2 = 106;
	public int y2 = 120;
	public int x3 = 106;
	public int y3 = 120;
	public static int m1 = 3000;
	public int m2 = 3000;
	public int m3 = 3000;
	public int f1 = 0;
	public int f2 = 0;
	public int f3 = 0;
	public int f4 = 0;
	public int f5 = 0;
	public int f6 = 0;
	public int f7 = 0;
	public int f8 = 0;
	public int f9 = 0;
	public int f10 = 0;
	public int f11 = 0;
	public int f12 = 0;
	public int f13 = 0;
	public int f1lv = 0;
	public int f2lv = 0;
	public int f3lv = 0;
	public int f4lv = 0;
	public int f5lv = 0;
	public int f6lv = 0;
	public int f7lv = 0;
	public int f8lv = 0;
	public int f9lv = 0;
	public int f10lv = 0;
	public int f11lv = 0;
	public int f12lv = 0;
	public int f13lv = 0;
	public static int s1 = 0;
	public static int s2 = 0;
	public static int s3 = 0;
	public static int order;
	public static int card1 = 0;
	public static int card2 = 0;
	public static int card3 = 0;
	public int t = 0;

	/** Creates new form zxcv */
	public Map1SView() {
		initComponents();
		jButton1.setOpaque(false);
		jButton2.setOpaque(false);
		jButton3.setOpaque(false);
		jButton4.setOpaque(false);
		jButton5.setOpaque(false);
		this.setLocationRelativeTo(null);
		if (m1 >= 5000) {
			new win().setVisible(true);
			this.dispose();

		}
		if (m1 <= 0) {
			new lose().setVisible(true);
			this.dispose();
		}
		if (m2 >= 5000) {
			new lose().setVisible(true);
			this.dispose();

		}
		if (m3 >= 5000) {
			new lose().setVisible(true);
			this.dispose();

		}
		if (m2 <= 0 && m3 <= 0) {
			new win().setVisible(true);
			this.dispose();
		}

	}

	/*
	 * 多线程
	 */
	
	class Play1 implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub	
			while (t == 1) {
				switch (order) {
				case 1:
					if (s1 == 0) {
						try {
							Thread.sleep(300);
							Random random = new Random();
							int index = random.nextInt(5);
							int move = index + 1;

							for (int i = 0; i < move; i++) {

								if (106 <= x1 && x1 < 634 && y1 == 120) {

									x1 = x1 + 88;
									jLabel26.setBounds(x1, y1, 50, 50);
									continue;

								} else if (106 < x1 && x1 <= 634 && y1 == 540) {
									x1 = x1 - 88;
									jLabel26.setBounds(x1, y1, 50, 50);
									continue;

								} else if (120 <= y1 && y1 < 540 && x1 == 634) {
									y1 = y1 + 70;
									jLabel26.setBounds(x1, y1, 50, 50);
									continue;

								} else if (120 < y1 && y1 <= 540 && x1 == 106) {
									y1 = y1 - 70;
									jLabel26.setBounds(x1, y1, 50, 50);
									continue;

								}

							}

							/*
							 * 1
							 */
							if (x1 == 282 && y1 == 120) {
								if (f1 == 0) {
									if (m1 > 300) {
										m1 = m1 - 300;
										jLabel48
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/Lv1.png")));
										jLabel4
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/格子1.png")));
										f1 = 1;
									} else {
										f1 = 0;
										return;
									}

								} else if (f1 == 1) {
									if (f1lv == 0) {
										if (m1 > 100) {
											m1 = m1 - 100;
											jLabel48
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv2.png")));
											f1lv = 1;
										} else {
											return;
										}

									} else if (f1lv == 1) {
										if (m1 > 100) {
											m1 = m1 - 100;
											jLabel48
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv3.png")));
											f1lv = 2;
										} else {
											return;
										}

									}

								} else if (f1 == 2) {
									if (f1lv == 0) {
										m1 = m1 - 100;
										m2 = m2 + 100;
									} else if (f1lv == 1) {
										m1 = m1 - 200;
										m2 = m2 + 200;
									} else if (f1lv == 2) {
										m1 = m1 - 300;
										m2 = m2 + 300;
									}

								} else if (f1 == 3) {
									if (f1lv == 0) {
										m1 = m1 - 100;
										m3 = m3 + 100;
									} else if (f1lv == 1) {
										m1 = m1 - 200;
										m3 = m3 + 200;
									} else if (f1lv == 2) {
										m1 = m1 - 300;
										m3 = m3 + 300;
									}

								}
							}
							/*
							 * 2
							 */
							if (x1 == 458 && y1 == 120) {
								if (f2 == 0) {
									if (m1 > 300) {
										m1 = m1 - 300;
										jLabel49
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/Lv1.png")));
										jLabel6
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/格子1.png")));
										f2 = 1;
									} else {
										f2 = 0;
										return;
									}

								} else if (f2 == 1) {
									if (f2lv == 0) {
										if (m1 > 100) {
											m1 = m1 - 100;
											jLabel49
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv2.png")));
											f2lv = 1;
										} else {
											return;
										}

									} else if (f2lv == 1) {
										if (m1 > 100) {
											m1 = m1 - 100;
											jLabel49
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv3.png")));
											f2lv = 2;
										} else {
											return;
										}

									}

								} else if (f2 == 2) {
									if (f2lv == 0) {
										m1 = m1 - 100;
										m2 = m2 + 100;
									} else if (f2lv == 1) {
										m1 = m1 - 200;
										m2 = m2 + 200;
									} else if (f2lv == 2) {
										m1 = m1 - 300;
										m2 = m2 + 300;
									}

								} else if (f2 == 3) {
									if (f2lv == 0) {
										m1 = m1 - 100;
										m3 = m3 + 100;
									} else if (f2lv == 1) {
										m1 = m1 - 200;
										m3 = m3 + 200;
									} else if (f2lv == 2) {
										m1 = m1 - 300;
										m3 = m3 + 300;
									}

								}
							}
							/*
							 * 3
							 */
							if (x1 == 546 && y1 == 120) {
								if (f3 == 0) {
									if (m1 > 300) {
										m1 = m1 - 300;
										jLabel50
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/Lv1.png")));
										jLabel7
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/格子1.png")));
										f3 = 1;
									} else {
										f3 = 0;
										return;
									}

								} else if (f3 == 1) {
									if (f3lv == 0) {
										if (m1 > 100) {
											m1 = m1 - 100;
											jLabel50
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv2.png")));
											f3lv = 1;
										} else {
											return;
										}

									} else if (f3lv == 1) {
										if (m1 > 100) {
											m1 = m1 - 100;
											jLabel50
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv3.png")));
											f3lv = 2;
										} else {
											return;
										}

									}

								} else if (f3 == 2) {
									if (f3lv == 0) {
										m1 = m1 - 100;
										m2 = m2 + 100;
									} else if (f3lv == 1) {
										m1 = m1 - 200;
										m2 = m2 + 200;
									} else if (f3lv == 2) {
										m1 = m1 - 300;
										m2 = m2 + 300;
									}

								} else if (f3 == 3) {
									if (f3lv == 0) {
										m1 = m1 - 100;
										m3 = m3 + 100;
									} else if (f3lv == 1) {
										m1 = m1 - 200;
										m3 = m3 + 200;
									} else if (f3lv == 2) {
										m1 = m1 - 300;
										m3 = m3 + 300;
									}

								}
							}
							/*
							 * 4
							 */
							if (x1 == 634 && y1 == 190) {
								if (f4 == 0) {
									if (m1 > 100) {
										m1 = m1 - 300;
										jLabel51
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/Lv1.png")));
										jLabel9
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/格子1.png")));
										f4 = 1;
									} else {
										f4 = 0;
										return;
									}

								} else if (f4 == 1) {
									if (f4lv == 0) {
										if (m1 > 100) {
											m1 = m1 - 100;
											jLabel51
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv2.png")));
											f4lv = 1;
										} else {
											return;
										}

									} else if (f4lv == 1) {
										if (m1 > 100) {
											m1 = m1 - 100;
											jLabel51
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv3.png")));
											f4lv = 2;
										} else {
											return;
										}

									}

								} else if (f4 == 2) {
									if (f4lv == 0) {
										m1 = m1 - 100;
										m2 = m2 + 100;
									} else if (f4lv == 1) {
										m1 = m1 - 200;
										m2 = m2 + 200;
									} else if (f4lv == 2) {
										m1 = m1 - 300;
										m2 = m2 + 300;
									}

								} else if (f4 == 3) {
									if (f4lv == 0) {
										m1 = m1 - 100;
										m3 = m3 + 100;
									} else if (f4lv == 1) {
										m1 = m1 - 200;
										m3 = m3 + 200;
									} else if (f4lv == 2) {
										m1 = m1 - 300;
										m3 = m3 + 300;
									}

								}
							}
							/*
							 * 5
							 */
							if (x1 == 634 && y1 == 330) {
								if (f5 == 0) {
									if (m1 > 300) {
										m1 = m1 - 300;
										jLabel52
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/Lv1.png")));
										jLabel11
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/格子1.png")));
										f5 = 1;
									} else {
										f5 = 0;
										return;
									}

								} else if (f5 == 1) {
									if (f5lv == 0) {
										if (m1 > 100) {
											m1 = m1 - 100;
											jLabel52
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv2.png")));
											f5lv = 1;
										} else {
											return;
										}

									} else if (f5lv == 1) {
										if (m1 > 100) {
											m1 = m1 - 100;
											jLabel52
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv3.png")));
											f5lv = 2;
										} else {
											return;
										}

									}

								} else if (f5 == 2) {
									if (f5lv == 0) {
										m1 = m1 - 100;
										m2 = m2 + 100;
									} else if (f5lv == 1) {
										m1 = m1 - 200;
										m2 = m2 + 200;
									} else if (f5lv == 2) {
										m1 = m1 - 300;
										m2 = m2 + 300;
									}

								} else if (f5 == 3) {
									if (f5lv == 0) {
										m1 = m1 - 100;
										m3 = m3 + 100;
									} else if (f5lv == 1) {
										m1 = m1 - 200;
										m3 = m3 + 200;
									} else if (f5lv == 2) {
										m1 = m1 - 300;
										m3 = m3 + 300;
									}

								}
							}
							/*
							 * 6
							 */
							if (x1 == 634 && y1 == 400) {
								if (f6 == 0) {
									if (m1 > 300) {
										m1 = m1 - 300;
										jLabel53
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/Lv1.png")));
										jLabel12
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/格子1.png")));
										f6 = 1;
									} else {
										f6 = 0;
										return;
									}

								} else if (f6 == 1) {
									if (f6lv == 0) {
										if (m1 > 100) {
											m1 = m1 - 100;
											jLabel53
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv2.png")));
											f6lv = 1;
										} else {
											return;
										}

									} else if (f6lv == 1) {
										if (m1 > 100) {
											m1 = m1 - 100;
											jLabel53
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv3.png")));
											f6lv = 2;
										} else {
											return;
										}

									}

								} else if (f6 == 2) {
									if (f6lv == 0) {
										m1 = m1 - 100;
										m2 = m2 + 100;
									} else if (f6lv == 1) {
										m1 = m1 - 200;
										m2 = m2 + 200;
									} else if (f6lv == 2) {
										m1 = m1 - 300;
										m2 = m2 + 300;
									}

								} else if (f6 == 3) {
									if (f6lv == 0) {
										m1 = m1 - 100;
										m3 = m3 + 100;
									} else if (f6lv == 1) {
										m1 = m1 - 200;
										m3 = m3 + 200;
									} else if (f6lv == 2) {
										m1 = m1 - 300;
										m3 = m3 + 300;
									}

								}
							}
							/*
							 * 7
							 */
							if (x1 == 546 && y1 == 540) {
								if (f7 == 0) {
									if (m1 > 300) {
										m1 = m1 - 300;
										jLabel54
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/Lv1.png")));
										jLabel15
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/格子1.png")));
										f7 = 1;
									} else {
										f7 = 0;
										return;
									}

								} else if (f7 == 1) {
									if (f7lv == 0) {
										if (m1 > 100) {
											m1 = m1 - 100;
											jLabel54
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv2.png")));
											f7lv = 1;
										} else {
											return;
										}

									} else if (f7lv == 1) {
										if (m1 > 100) {
											m1 = m1 - 100;
											jLabel54
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv3.png")));
											f7lv = 2;
										} else {
											return;
										}

									}

								} else if (f7 == 2) {
									if (f7lv == 0) {
										m1 = m1 - 100;
										m2 = m2 + 100;
									} else if (f7lv == 1) {
										m1 = m1 - 200;
										m2 = m2 + 200;
									} else if (f7lv == 2) {
										m1 = m1 - 300;
										m2 = m2 + 300;
									}

								} else if (f7 == 3) {
									if (f7lv == 0) {
										m1 = m1 - 100;
										m3 = m3 + 100;
									} else if (f7lv == 1) {
										m1 = m1 - 200;
										m3 = m3 + 200;
									} else if (f7lv == 2) {
										m1 = m1 - 300;
										m3 = m3 + 300;
									}

								}
							}
							/*
							 * 8
							 */
							if (x1 == 458 && y1 == 540) {
								if (f8 == 0) {
									if (m1 > 300) {
										m1 = m1 - 300;
										jLabel55
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/Lv1.png")));
										jLabel16
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/格子1.png")));
										f8 = 1;
									} else {
										f8 = 0;
										return;
									}

								} else if (f8 == 1) {
									if (f8lv == 0) {
										if (m1 > 100) {
											m1 = m1 - 100;
											jLabel55
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv2.png")));
											f8lv = 1;
										} else {
											return;
										}

									} else if (f8lv == 1) {
										if (m1 > 100) {
											m1 = m1 - 100;
											jLabel55
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv3.png")));
											f8lv = 2;
										} else {
											return;
										}

									}

								} else if (f8 == 2) {
									if (f8lv == 0) {
										m1 = m1 - 100;
										m2 = m2 + 100;
									} else if (f8lv == 1) {
										m1 = m1 - 200;
										m2 = m2 + 200;
									} else if (f8lv == 2) {
										m1 = m1 - 300;
										m2 = m2 + 300;
									}

								} else if (f8 == 3) {
									if (f8lv == 0) {
										m1 = m1 - 100;
										m3 = m3 + 100;
									} else if (f8lv == 1) {
										m1 = m1 - 200;
										m3 = m3 + 200;
									} else if (f8lv == 2) {
										m1 = m1 - 300;
										m3 = m3 + 300;
									}

								}
							}
							/*
							 * 9
							 */
							if (x1 == 370 && y1 == 540) {
								if (f9 == 0) {
									if (m1 > 300) {
										m1 = m1 - 300;
										jLabel56
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/Lv1.png")));
										jLabel17
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/格子1.png")));
										f9 = 1;
									} else {
										f9 = 0;
										return;
									}

								} else if (f9 == 1) {
									if (f9lv == 0) {
										if (m1 > 100) {
											m1 = m1 - 100;
											jLabel56
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv2.png")));
											f9lv = 1;
										} else {
											return;
										}

									} else if (f9lv == 1) {
										if (m1 > 100) {
											m1 = m1 - 100;
											jLabel56
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv3.png")));
											f9lv = 2;
										} else {
											return;
										}

									}

								} else if (f9 == 2) {
									if (f9lv == 0) {
										m1 = m1 - 100;
										m2 = m2 + 100;
									} else if (f9lv == 1) {
										m1 = m1 - 200;
										m2 = m2 + 200;
									} else if (f9lv == 2) {
										m1 = m1 - 300;
										m2 = m2 + 300;
									}

								} else if (f9 == 3) {
									if (f9lv == 0) {
										m1 = m1 - 100;
										m3 = m3 + 100;
									} else if (f9lv == 1) {
										m1 = m1 - 200;
										m3 = m3 + 200;
									} else if (f9lv == 2) {
										m1 = m1 - 300;
										m3 = m3 + 300;
									}

								}
							}
							/*
							 * 10
							 */
							if (x1 == 194 && y1 == 540) {
								if (f10 == 0) {
									if (m1 > 300) {
										m1 = m1 - 300;
										jLabel57
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/Lv1.png")));
										jLabel19
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/格子1.png")));
										f10 = 1;
									} else {
										f10 = 0;
										return;
									}

								} else if (f10 == 1) {
									if (f10lv == 0) {
										if (m1 > 100) {
											m1 = m1 - 100;
											jLabel57
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv2.png")));
											f10lv = 1;
										} else {
											return;
										}

									} else if (f10lv == 1) {
										if (m1 > 100) {
											m1 = m1 - 100;
											jLabel57
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv3.png")));
											f10lv = 2;
										} else {
											return;
										}

									}
								} else if (f10 == 2) {
									if (f10lv == 0) {
										m1 = m1 - 100;
										m2 = m2 + 100;
									} else if (f10lv == 1) {
										m1 = m1 - 200;
										m2 = m2 + 200;
									} else if (f10lv == 2) {
										m1 = m1 - 300;
										m2 = m2 + 300;
									}

								} else if (f10 == 3) {
									if (f10lv == 0) {
										m1 = m1 - 100;
										m3 = m3 + 100;
									} else if (f10lv == 1) {
										m1 = m1 - 200;
										m3 = m3 + 200;
									} else if (f10lv == 2) {
										m1 = m1 - 300;
										m3 = m3 + 300;
									}

								}
							}
							/*
							 * 11
							 */
							if (x1 == 106 && y1 == 470) {
								if (f11 == 0) {

									if (m1 > 300) {
										m1 = m1 - 300;
										jLabel58
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/Lv1.png")));
										jLabel21
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/格子1.png")));
										f11 = 1;
									} else {
										f11 = 0;
										return;
									}

								} else if (f11 == 1) {
									if (f11lv == 0) {

										if (m1 > 100) {
											m1 = m1 - 100;
											jLabel58
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv2.png")));
											f11lv = 1;
										} else {
											return;
										}

									} else if (f11lv == 1) {
										if (m1 > 100) {
											m1 = m1 - 100;
											jLabel58
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv3.png")));
											f11lv = 2;
										} else {
											return;
										}

									}

								} else if (f11 == 2) {
									if (f11lv == 0) {
										m1 = m1 - 100;
										m2 = m2 + 100;
									} else if (f11lv == 1) {
										m1 = m1 - 200;
										m2 = m2 + 200;
									} else if (f11lv == 2) {
										m1 = m1 - 300;
										m2 = m2 + 300;
									}

								} else if (f11 == 3) {
									if (f11lv == 0) {
										m1 = m1 - 100;
										m3 = m3 + 100;
									} else if (f11lv == 1) {
										m1 = m1 - 200;
										m3 = m3 + 200;
									} else if (f11lv == 2) {
										m1 = m1 - 300;
										m3 = m3 + 300;
									}

								}
							}/*
								 * 12
								 */
							if (x1 == 106 && y1 == 330) {
								if (f12 == 0) {
									if (m1 > 300) {
										m1 = m1 - 300;
										jLabel59
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/Lv1.png")));
										jLabel23
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/格子1.png")));
										f12 = 1;
									} else {
										f12 = 0;
										return;
									}

								} else if (f12 == 1) {
									if (f12lv == 0) {
										if (m1 > 100) {
											m1 = m1 - 100;
											jLabel59
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv2.png")));
											f12lv = 1;
										} else {
											return;
										}

									} else if (f12lv == 1) {
										if (m1 > 100) {
											m1 = m1 - 100;
											jLabel59
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv3.png")));
											f12lv = 2;
										} else {
											return;
										}

									}

								} else if (f12 == 2) {
									if (f12lv == 0) {
										m1 = m1 - 100;
										m2 = m2 + 100;
									} else if (f12lv == 1) {
										m1 = m1 - 200;
										m2 = m2 + 200;
									} else if (f12lv == 2) {
										m1 = m1 - 300;
										m2 = m2 + 300;
									}

								} else if (f12 == 3) {
									if (f12lv == 0) {
										m1 = m1 - 100;
										m3 = m3 + 100;
									} else if (f12lv == 1) {
										m1 = m1 - 200;
										m3 = m3 + 200;
									} else if (f12lv == 2) {
										m1 = m1 - 300;
										m3 = m3 + 300;
									}

								}
							}/*
								 * 13
								 */
							if (x1 == 106 && y1 == 260) {
								if (f13 == 0) {
									if (m1 > 300) {
										m1 = m1 - 300;
										jLabel60
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/Lv1.png")));
										jLabel24
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/格子1.png")));
										f13 = 1;
									} else {
										f13 = 0;
										return;
									}

								} else if (f13 == 1) {
									if (f13lv == 0) {
										if (m1 > 100) {
											m1 = m1 - 100;
											jLabel60
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv2.png")));
											f13lv = 1;
										} else {
											return;
										}

									} else if (f13lv == 1) {
										if (m1 > 100) {
											m1 = m1 - 100;
											jLabel60
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv3.png")));
											f13lv = 2;
										} else {
											return;
										}

									}

								} else if (f13 == 2) {
									if (f13lv == 0) {
										m1 = m1 - 100;
										m2 = m2 + 100;
									} else if (f13lv == 1) {
										m1 = m1 - 200;
										m2 = m2 + 200;
									} else if (f13lv == 2) {
										m1 = m1 - 300;
										m2 = m2 + 300;
									}

								} else if (f13 == 3) {
									if (f13lv == 0) {
										m1 = m1 - 100;
										m3 = m3 + 100;
									} else if (f13lv == 1) {
										m1 = m1 - 200;
										m3 = m3 + 200;
									} else if (f13lv == 2) {
										m1 = m1 - 300;
										m3 = m3 + 300;
									}

								}
							}
							/*
							 * 随机事件格子
							 */
							if (x1 == 370 && y1 == 120) {
								Random r1 = new Random();
								int sj1 = r1.nextInt(2);
								if (sj1 == 0) {
									s1 = 1;
								} else if (sj1 == 1) {
									m1 = m1 + 300;
								} else if (sj1 == 2) {
									m1 = m1 - 100;
								}

							}
							/*
							 * 抽卡格子
							 */
							if (x1 == 634 && y1 == 120) {
								Random c = new Random();
								int card = c.nextInt(2);
								if (card1 == 0) {
									card1 = card + 1;
								} else if (card2 == 0) {
									card2 = card + 1;

								} else if (card3 == 0) {
									card3 = card + 1;

								}

							}
							/*
							 * 加钱格子
							 */
							if (x1 == 634 && y1 == 540) {
								m1 = m1 + 300;

							}
							/*
							 * 暂停格子
							 */
							if (x1 == 106 && y1 == 540) {
								s1 = 1;

							}
							/*
							 * 扣钱格子
							 */
							if (x1 == 106 && y1 == 400) {
								m1 = m1 - 100;

							}
							jTextField1.setText(Integer.toString(m1));
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						order = 2;
					} else if (s1 == 1) {
						s1 = s1 - 1;
						order = 2;
					}

				case 2:
					if (s2 == 0) {
						try {
							Thread.sleep(600);
							Random random2 = new Random();
							int index2 = random2.nextInt(5);
							int move2 = index2 + 1;
							for (int i = 0; i < move2; i++) {

								if (106 <= x2 && x2 < 634 && y2 == 120) {
									x2 = x2 + 88;
									jLabel61.setBounds(x2, y2, 50, 50);
									continue;
								} else if (106 < x2 && x2 <= 634 && y2 == 540) {
									x2 = x2 - 88;
									jLabel61.setBounds(x2, y2, 50, 50);
									continue;
								} else if (120 <= y2 && y2 < 540 && x2 == 634) {
									y2 = y2 + 70;
									jLabel61.setBounds(x2, y2, 50, 50);
									continue;
								} else if (120 < y2 && y2 <= 540 && x2 == 106) {
									y2 = y2 - 70;
									jLabel61.setBounds(x2, y2, 50, 50);
									continue;
								}

							}
							/*
							 * 1
							 */
							if (x2 == 282 && y2 == 120) {
								if (f1 == 0) {
									if (m2 >= 300) {
										m2 = m2 - 300;
										jLabel48
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/Lv1.png")));
										jLabel4
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/格子2.png")));

										f1 = 2;
									}

								} else if (f1 == 2) {
									if (f1lv == 0) {
										if (m2 >= 100) {
											m2 = m2 - 100;
											jLabel48
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv2.png")));
											f1lv = 1;
										}

									} else if (f1lv == 1) {
										if (m2 >= 100) {
											m2 = m2 - 100;
											jLabel48
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv3.png")));
											f1lv = 2;
										}

									}

								} else if (f1 == 1) {
									if (f1lv == 0) {
										m1 = m1 + 100;
										m2 = m2 - 100;
									} else if (f1lv == 1) {
										m1 = m1 + 200;
										m2 = m2 - 200;
									} else if (f1lv == 2) {
										m1 = m1 + 300;
										m2 = m2 - 300;
									}

								} else if (f1 == 3) {
									if (f1lv == 0) {
										m2 = m2 - 100;
										m3 = m3 + 100;
									} else if (f1lv == 1) {
										m2 = m2 - 200;
										m3 = m3 + 200;
									} else if (f1lv == 2) {
										m2 = m2 - 300;
										m3 = m3 + 300;
									}
								}
							}
							/*
							 * 2
							 */
							if (x2 == 458 && y2 == 120) {
								if (f2 == 0) {
									if (m2 >= 300) {
										m2 = m2 - 300;
										jLabel49
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/Lv1.png")));
										jLabel6
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/格子2.png")));

										f2 = 2;
									}

								} else if (f2 == 2) {
									if (f2lv == 0) {
										if (m2 >= 100) {
											m2 = m2 - 100;
											jLabel49
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv2.png")));
											f2lv = 1;
										}

									} else if (f2lv == 1) {
										if (m2 >= 100) {
											m2 = m2 - 100;
											jLabel49
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv3.png")));
											f2lv = 2;
										}

									}

								} else if (f2 == 1) {
									if (f2lv == 0) {
										m1 = m1 + 100;
										m2 = m2 - 100;
									} else if (f2lv == 1) {
										m1 = m1 + 200;
										m2 = m2 - 200;
									} else if (f2lv == 2) {
										m1 = m1 + 300;
										m2 = m2 - 300;
									}

								} else if (f2 == 3) {
									if (f2lv == 0) {
										m2 = m2 - 100;
										m3 = m3 + 100;
									} else if (f2lv == 1) {
										m2 = m2 - 200;
										m3 = m3 + 200;
									} else if (f2lv == 2) {
										m2 = m2 - 300;
										m3 = m3 + 300;
									}
								}
							}
							/*
							 * 3
							 */
							if (x2 == 546 && y2 == 120) {
								if (f3 == 0) {
									if (m2 >= 300) {
										m2 = m2 - 300;
										jLabel50
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/Lv1.png")));
										jLabel7
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/格子2.png")));

										f3 = 2;
									}

								} else if (f3 == 2) {
									if (f3lv == 0) {
										if (m2 >= 100) {
											m2 = m2 - 100;
											jLabel50
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv2.png")));
											f3lv = 1;
										}

									} else if (f3lv == 1) {
										if (m2 >= 100) {
											m2 = m2 - 100;
											jLabel50
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv3.png")));
											f3lv = 2;
										}

									}

								} else if (f3 == 1) {
									if (f3lv == 0) {
										m1 = m1 + 100;
										m2 = m2 - 100;
									} else if (f3lv == 1) {
										m1 = m1 + 200;
										m2 = m2 - 200;
									} else if (f3lv == 2) {
										m1 = m1 + 300;
										m2 = m2 - 300;
									}

								} else if (f3 == 3) {
									if (f3lv == 0) {
										m2 = m2 - 100;
										m3 = m3 + 100;
									} else if (f3lv == 1) {
										m2 = m2 - 200;
										m3 = m3 + 200;
									} else if (f3lv == 2) {
										m2 = m2 - 300;
										m3 = m3 + 300;
									}
								}
							}
							/*
							 * 4
							 */
							if (x2 == 634 && y2 == 190) {
								if (f4 == 0) {
									if (m2 >= 300) {
										m2 = m2 - 300;
										jLabel51
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/Lv1.png")));
										jLabel9
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/格子2.png")));

										f4 = 2;
									}

								} else if (f4 == 2) {
									if (f4lv == 0) {
										if (m2 >= 100) {
											m2 = m2 - 100;
											jLabel51
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv2.png")));
											f4lv = 1;
										}

									} else if (f4lv == 1) {
										if (m2 >= 100) {
											m2 = m2 - 100;
											jLabel51
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv3.png")));
											f4lv = 2;
										}

									}

								} else if (f4 == 1) {
									if (f4lv == 0) {
										m1 = m1 + 100;
										m2 = m2 - 100;
									} else if (f4lv == 1) {
										m1 = m1 + 200;
										m2 = m2 - 200;
									} else if (f4lv == 2) {
										m1 = m1 + 300;
										m2 = m2 - 300;
									}

								} else if (f4 == 3) {
									if (f4lv == 0) {
										m2 = m2 - 100;
										m3 = m3 + 100;
									} else if (f4lv == 1) {
										m2 = m2 - 200;
										m3 = m3 + 200;
									} else if (f4lv == 2) {
										m2 = m2 - 300;
										m3 = m3 + 300;
									}
								}
							}
							/*
							 * 5
							 */
							if (x2 == 634 && y2 == 330) {
								if (f5 == 0) {
									if (m2 >= 300) {
										m2 = m2 - 300;
										jLabel52
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/Lv1.png")));
										jLabel11
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/格子2.png")));

										f5 = 2;
									}

								} else if (f5 == 2) {
									if (f5lv == 0) {
										if (m2 >= 100) {
											m2 = m2 - 100;
											jLabel52
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv2.png")));
											f5lv = 1;
										}

									} else if (f5lv == 1) {
										if (m2 >= 100) {
											m2 = m2 - 100;
											jLabel52
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv3.png")));
											f5lv = 2;
										}

									}

								} else if (f5 == 1) {
									if (f5lv == 0) {
										m1 = m1 + 100;
										m2 = m2 - 100;
									} else if (f5lv == 1) {
										m1 = m1 + 200;
										m2 = m2 - 200;
									} else if (f5lv == 2) {
										m1 = m1 + 300;
										m2 = m2 - 300;
									}

								} else if (f5 == 3) {
									if (f5lv == 0) {
										m2 = m2 - 100;
										m3 = m3 + 100;
									} else if (f5lv == 1) {
										m2 = m2 - 200;
										m3 = m3 + 200;
									} else if (f5lv == 2) {
										m2 = m2 - 300;
										m3 = m3 + 300;
									}
								}
							}
							/*
							 * 6
							 */
							if (x2 == 634 && y2 == 400) {
								if (f6 == 0) {
									if (m2 >= 300) {
										m2 = m2 - 300;
										jLabel53
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/Lv1.png")));
										jLabel12
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/格子2.png")));

										f6 = 2;
									}

								} else if (f6 == 2) {
									if (f6lv == 0) {
										if (m2 >= 100) {
											m2 = m2 - 100;
											jLabel53
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv2.png")));
											f6lv = 1;
										}

									} else if (f6lv == 1) {
										if (m2 >= 100) {
											m2 = m2 - 100;
											jLabel53
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv3.png")));
											f6lv = 2;
										}

									}

								} else if (f6 == 1) {
									if (f6lv == 0) {
										m1 = m1 + 100;
										m2 = m2 - 100;
									} else if (f6lv == 1) {
										m1 = m1 + 200;
										m2 = m2 - 200;
									} else if (f6lv == 2) {
										m1 = m1 + 300;
										m2 = m2 - 300;
									}

								} else if (f6 == 3) {
									if (f6lv == 0) {
										m2 = m2 - 100;
										m3 = m3 + 100;
									} else if (f6lv == 1) {
										m2 = m2 - 200;
										m3 = m3 + 200;
									} else if (f6lv == 2) {
										m2 = m2 - 300;
										m3 = m3 + 300;
									}
								}
							}
							/*
							 * 7
							 */
							if (x2 == 546 && y2 == 540) {
								if (f7 == 0) {
									if (m2 >= 300) {
										m2 = m2 - 300;
										jLabel54
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/Lv1.png")));
										jLabel15
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/格子2.png")));

										f7 = 2;
									}

								} else if (f7 == 2) {
									if (f7lv == 0) {
										if (m2 >= 100) {
											m2 = m2 - 100;
											jLabel54
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv2.png")));
											f7lv = 1;
										}

									} else if (f7lv == 1) {
										if (m2 >= 100) {
											m2 = m2 - 100;
											jLabel54
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv3.png")));
											f7lv = 2;
										}

									}

								} else if (f7 == 1) {
									if (f7lv == 0) {
										m1 = m1 + 100;
										m2 = m2 - 100;
									} else if (f7lv == 1) {
										m1 = m1 + 200;
										m2 = m2 - 200;
									} else if (f7lv == 2) {
										m1 = m1 + 300;
										m2 = m2 - 300;
									}

								} else if (f7 == 3) {
									if (f7lv == 0) {
										m2 = m2 - 100;
										m3 = m3 + 100;
									} else if (f7lv == 1) {
										m2 = m2 - 200;
										m3 = m3 + 200;
									} else if (f7lv == 2) {
										m2 = m2 - 300;
										m3 = m3 + 300;
									}
								}
							}
							/*
							 * 8
							 */
							if (x2 == 458 && y2 == 540) {
								if (f8 == 0) {
									if (m2 >= 300) {
										m2 = m2 - 300;
										jLabel55
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/Lv1.png")));
										jLabel16
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/格子2.png")));

										f8 = 2;
									}

								} else if (f8 == 2) {
									if (f8lv == 0) {
										if (m2 >= 100) {
											m2 = m2 - 100;
											jLabel55
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv2.png")));
											f8lv = 1;
										}

									} else if (f8lv == 1) {
										if (m2 >= 100) {
											m2 = m2 - 100;
											jLabel54
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv3.png")));
											f8lv = 2;
										}

									}

								} else if (f8 == 1) {
									if (f8lv == 0) {
										m1 = m1 + 100;
										m2 = m2 - 100;
									} else if (f8lv == 1) {
										m1 = m1 + 200;
										m2 = m2 - 200;
									} else if (f8lv == 2) {
										m1 = m1 + 300;
										m2 = m2 - 300;
									}

								} else if (f8 == 3) {
									if (f8lv == 0) {
										m2 = m2 - 100;
										m3 = m3 + 100;
									} else if (f8lv == 1) {
										m2 = m2 - 200;
										m3 = m3 + 200;
									} else if (f7lv == 2) {
										m2 = m2 - 300;
										m3 = m3 + 300;
									}
								}
							}
							/*
							 * 9
							 */
							if (x2 == 370 && y2 == 540) {
								if (f9 == 0) {
									if (m2 >= 300) {
										m2 = m2 - 300;
										jLabel56
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/Lv1.png")));
										jLabel17
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/格子2.png")));

										f9 = 2;
									}

								} else if (f9 == 2) {
									if (f9lv == 0) {
										if (m2 >= 100) {
											m2 = m2 - 100;
											jLabel56
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv2.png")));
											f9lv = 1;
										}

									} else if (f9lv == 1) {
										if (m2 >= 100) {
											m2 = m2 - 100;
											jLabel56
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv3.png")));
											f9lv = 2;
										}

									}

								} else if (f9 == 1) {
									if (f9lv == 0) {
										m1 = m1 + 100;
										m2 = m2 - 100;
									} else if (f9lv == 1) {
										m1 = m1 + 200;
										m2 = m2 - 200;
									} else if (f9lv == 2) {
										m1 = m1 + 300;
										m2 = m2 - 300;
									}

								} else if (f9 == 3) {
									if (f9lv == 0) {
										m2 = m2 - 100;
										m3 = m3 + 100;
									} else if (f9lv == 1) {
										m2 = m2 - 200;
										m3 = m3 + 200;
									} else if (f9lv == 2) {
										m2 = m2 - 300;
										m3 = m3 + 300;
									}
								}
							}
							/*
							 * 10
							 */
							if (x2 == 194 && y2 == 540) {
								if (f10 == 0) {
									if (m2 >= 300) {
										m2 = m2 - 300;
										jLabel57
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/Lv1.png")));
										jLabel19
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/格子2.png")));

										f10 = 2;
									}

								} else if (f10 == 2) {
									if (f10lv == 0) {
										if (m2 >= 100) {
											m2 = m2 - 100;
											jLabel57
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv2.png")));
											f10lv = 1;
										}

									} else if (f10lv == 1) {
										if (m2 >= 100) {
											m2 = m2 - 100;
											jLabel57
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv3.png")));
											f10lv = 2;
										}

									}

								} else if (f10 == 1) {
									if (f10lv == 0) {
										m1 = m1 + 100;
										m2 = m2 - 100;
									} else if (f10lv == 1) {
										m1 = m1 + 200;
										m2 = m2 - 200;
									} else if (f10lv == 2) {
										m1 = m1 + 300;
										m2 = m2 - 300;
									}

								} else if (f10 == 3) {
									if (f10lv == 0) {
										m2 = m2 - 100;
										m3 = m3 + 100;
									} else if (f10lv == 1) {
										m2 = m2 - 200;
										m3 = m3 + 200;
									} else if (f10lv == 2) {
										m2 = m2 - 300;
										m3 = m3 + 300;
									}
								}
							}
							/*
							 * 11
							 */
							if (x2 == 106 && y2 == 470) {
								if (f11 == 0) {
									if (m2 >= 300) {
										m2 = m2 - 300;
										jLabel58
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/Lv1.png")));
										jLabel21
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/格子2.png")));

										f11 = 2;
									}

								} else if (f11 == 2) {
									if (f11lv == 0) {
										if (m2 >= 100) {
											m2 = m2 - 100;
											jLabel58
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv2.png")));
											f11lv = 1;
										}

									} else if (f11lv == 1) {
										if (m2 >= 100) {
											m2 = m2 - 100;
											jLabel58
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv3.png")));
											f11lv = 2;
										}

									}

								} else if (f11 == 1) {
									if (f11lv == 0) {
										m1 = m1 + 100;
										m2 = m2 - 100;
									} else if (f11lv == 1) {
										m1 = m1 + 200;
										m2 = m2 - 200;
									} else if (f11lv == 2) {
										m1 = m1 + 300;
										m2 = m2 - 300;
									}

								} else if (f11 == 3) {
									if (f11lv == 0) {
										m2 = m2 - 100;
										m3 = m3 + 100;
									} else if (f11lv == 1) {
										m2 = m2 - 200;
										m3 = m3 + 200;
									} else if (f11lv == 2) {
										m2 = m2 - 300;
										m3 = m3 + 300;
									}
								}
							}
							/*
							 * 12
							 */
							if (x2 == 106 && y2 == 330) {
								if (f12 == 0) {
									if (m2 >= 300) {
										m2 = m2 - 300;
										jLabel59
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/Lv1.png")));
										jLabel23
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/格子2.png")));

										f12 = 2;
									}

								} else if (f12 == 2) {
									if (f12lv == 0) {
										if (m2 >= 100) {
											m2 = m2 - 100;
											jLabel59
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv2.png")));
											f12lv = 1;
										}

									} else if (f12lv == 1) {
										if (m2 >= 100) {
											m2 = m2 - 100;
											jLabel59
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv3.png")));
											f12lv = 2;
										}

									}

								} else if (f12 == 1) {
									if (f12lv == 0) {
										m1 = m1 + 100;
										m2 = m2 - 100;
									} else if (f12lv == 1) {
										m1 = m1 + 200;
										m2 = m2 - 200;
									} else if (f12lv == 2) {
										m1 = m1 + 300;
										m2 = m2 - 300;
									}

								} else if (f12 == 3) {
									if (f12lv == 0) {
										m2 = m2 - 100;
										m3 = m3 + 100;
									} else if (f12lv == 1) {
										m2 = m2 - 200;
										m3 = m3 + 200;
									} else if (f12lv == 2) {
										m2 = m2 - 300;
										m3 = m3 + 300;
									}
								}
							}
							/*
							 * 13
							 */
							if (x2 == 106 && y2 == 260) {
								if (f13 == 0) {
									if (m2 >= 300) {
										m2 = m2 - 300;
										jLabel60
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/Lv1.png")));
										jLabel24
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/格子2.png")));

										f13 = 2;
									}

								} else if (f13 == 2) {
									if (f13lv == 0) {
										if (m2 >= 100) {
											m2 = m2 - 100;
											jLabel60
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv2.png")));
											f13lv = 1;
										}

									} else if (f13lv == 1) {
										if (m2 >= 100) {
											m2 = m2 - 100;
											jLabel60
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv3.png")));
											f13lv = 2;
										}

									}

								} else if (f13 == 1) {
									if (f13lv == 0) {
										m1 = m1 + 100;
										m2 = m2 - 100;
									} else if (f13lv == 1) {
										m1 = m1 + 200;
										m2 = m2 - 200;
									} else if (f13lv == 2) {
										m1 = m1 + 300;
										m2 = m2 - 300;
									}

								} else if (f13 == 3) {
									if (f13lv == 0) {
										m2 = m2 - 100;
										m3 = m3 + 100;
									} else if (f13lv == 1) {
										m2 = m2 - 200;
										m3 = m3 + 200;
									} else if (f13lv == 2) {
										m2 = m2 - 300;
										m3 = m3 + 300;
									}
								}
							}
							/*
							 * 随机事件格子
							 */
							if (x2 == 370 && y2 == 120) {
								Random r2 = new Random();
								int sj2 = r2.nextInt(2);
								if (sj2 == 0) {
									s2 = 1;
								} else if (sj2 == 1) {
									m2 = m2 + 300;
								} else if (sj2 == 2) {
									m2 = m2 - 100;
								}
							}
							/*
							 * 抽卡格子
							 */
							if (x2 == 634 && y2 == 120) {

							}
							/*
							 * 加钱格子
							 */
							if (x2 == 634 && y2 == 540) {
								m2 = m2 + 300;
							}
							/*
							 * 暂停格子
							 */
							if (x2 == 106 && y2 == 540) {
								s2 = 1;
							}
							/*
							 * 扣钱格子
							 */
							if (x2 == 106 && y2 == 400) {
								m2 = m2 - 100;
							}
							jTextField3.setText(Integer.toString(m2));

						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						order = 3;
					} else if (s2 == 1) {
						s2 = s2 - 1;
						order = 3;
					}

				case 3:
					if (s3 == 0) {
						try {
							Thread.sleep(900);
							Random random3 = new Random();
							int index3 = random3.nextInt(5);
							int move3 = index3 + 1;
							for (int i = 0; i < move3; i++) {

								if (106 <= x3 && x3 < 634 && y3 == 120) {
									x3 = x3 + 88;
									jLabel62.setBounds(x3, y3, 50, 50);
									continue;
								}
								if (106 < x3 && x3 <= 634 && y3 == 540) {
									x3 = x3 - 88;
									jLabel62.setBounds(x3, y3, 50, 50);
									continue;
								}
								if (120 <= y3 && y3 < 540 && x3 == 634) {
									y3 = y3 + 70;
									jLabel62.setBounds(x3, y3, 50, 50);
									continue;
								}
								if (120 < y3 && y3 <= 540 && x3 == 106) {
									y3 = y3 - 70;
									jLabel62.setBounds(x3, y3, 50, 50);
									continue;
								}

							}
							/*
							 * 1
							 */
							if (x3 == 282 && y3 == 120) {
								if (f1 == 0) {
									if (m3 >= 300) {
										m3 = m3 - 300;
										jLabel48
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/Lv1.png")));
										jLabel4
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/格子3.png")));

										f1 = 3;
									}

								} else if (f1 == 3) {
									if (f1lv == 0) {
										if (m3 >= 100) {
											m3 = m3 - 100;
											jLabel48
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv2.png")));
											f1lv = 1;
										}

									} else if (f1lv == 1) {
										if (m3 >= 100) {
											m3 = m3 - 100;
											jLabel48
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv3.png")));
											f1lv = 2;
										}

									}

								} else if (f1 == 1) {
									if (f1lv == 0) {
										m1 = m1 + 100;
										m3 = m3 - 100;
									} else if (f1lv == 1) {
										m1 = m1 + 200;
										m3 = m3 - 200;
									} else if (f1lv == 2) {
										m1 = m1 + 300;
										m3 = m3 - 300;
									}

								} else if (f1 == 2) {
									if (f1lv == 0) {
										m2 = m2 + 100;
										m3 = m3 - 100;
									} else if (f1lv == 1) {
										m2 = m2 + 200;
										m3 = m3 - 200;
									} else if (f1lv == 2) {
										m2 = m2 + 300;
										m3 = m3 - 300;
									}
								}
							}
							/*
							 * 2
							 */
							if (x3 == 458 && y3 == 120) {
								if (f2 == 0) {
									if (m3 >= 300) {
										m3 = m3 - 300;
										jLabel49
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/Lv1.png")));
										jLabel6
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/格子3.png")));

										f2 = 3;
									}

								} else if (f2 == 3) {
									if (f2lv == 0) {
										if (m3 >= 100) {
											m3 = m3 - 100;
											jLabel49
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv2.png")));
											f2lv = 1;
										}

									} else if (f2lv == 1) {
										if (m3 >= 100) {
											m3 = m3 - 100;
											jLabel49
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv3.png")));
											f2lv = 2;
										}

									}

								} else if (f2 == 1) {
									if (f2lv == 0) {
										m1 = m1 + 100;
										m3 = m3 - 100;
									} else if (f2lv == 1) {
										m1 = m1 + 200;
										m3 = m3 - 200;
									} else if (f2lv == 2) {
										m1 = m1 + 300;
										m3 = m3 - 300;
									}

								} else if (f2 == 2) {
									if (f2lv == 0) {
										m2 = m2 + 100;
										m3 = m3 - 100;
									} else if (f2lv == 1) {
										m2 = m2 + 200;
										m3 = m3 - 200;
									} else if (f2lv == 2) {
										m2 = m2 + 300;
										m3 = m3 - 300;
									}
								}
							}
							/*
							 * 3
							 */
							if (x3 == 546 && y3 == 120) {
								if (f3 == 0) {
									if (m3 >= 300) {
										m3 = m3 - 300;
										jLabel50
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/Lv1.png")));
										jLabel7
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/格子3.png")));

										f3 = 3;
									}

								} else if (f3 == 3) {
									if (f3lv == 0) {
										if (m3 >= 100) {
											m3 = m3 - 100;
											jLabel50
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv2.png")));
											f3lv = 1;
										}

									} else if (f3lv == 1) {
										if (m3 >= 100) {
											m3 = m3 - 100;
											jLabel50
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv3.png")));
											f3lv = 2;
										}

									}

								} else if (f3 == 1) {
									if (f3lv == 0) {
										m1 = m1 + 100;
										m3 = m3 - 100;
									} else if (f3lv == 1) {
										m1 = m1 + 200;
										m3 = m3 - 200;
									} else if (f3lv == 2) {
										m1 = m1 + 300;
										m3 = m3 - 300;
									}

								} else if (f3 == 2) {
									if (f3lv == 0) {
										m2 = m2 + 100;
										m3 = m3 - 100;
									} else if (f3lv == 1) {
										m2 = m2 + 200;
										m3 = m3 - 200;
									} else if (f3lv == 2) {
										m2 = m2 + 300;
										m3 = m3 - 300;
									}
								}
							}
							/*
							 * 4
							 */
							if (x3 == 634 && y3 == 190) {
								if (f4 == 0) {
									if (m3 >= 300) {
										m3 = m3 - 300;
										jLabel51
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/Lv1.png")));
										jLabel9
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/格子3.png")));

										f4 = 3;
									}

								} else if (f4 == 3) {
									if (f4lv == 0) {
										if (m3 >= 100) {
											m3 = m3 - 100;
											jLabel51
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv2.png")));
											f4lv = 1;
										}

									} else if (f4lv == 1) {
										if (m3 >= 100) {
											m3 = m3 - 100;
											jLabel51
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv3.png")));
											f4lv = 2;
										}

									}

								} else if (f4 == 1) {
									if (f4lv == 0) {
										m1 = m1 + 100;
										m3 = m3 - 100;
									} else if (f4lv == 1) {
										m1 = m1 + 200;
										m3 = m3 - 200;
									} else if (f4lv == 2) {
										m1 = m1 + 300;
										m3 = m3 - 300;
									}

								} else if (f4 == 2) {
									if (f4lv == 0) {
										m2 = m2 + 100;
										m3 = m3 - 100;
									} else if (f4lv == 1) {
										m2 = m2 + 200;
										m3 = m3 - 200;
									} else if (f4lv == 2) {
										m2 = m2 + 300;
										m3 = m3 - 300;
									}
								}
							}
							/*
							 * 5
							 */
							if (x3 == 634 && y3 == 330) {
								if (f3 == 0) {
									if (m3 >= 300) {
										m3 = m3 - 300;
										jLabel52
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/Lv1.png")));
										jLabel11
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/格子3.png")));

										f5 = 3;
									}

								} else if (f5 == 3) {
									if (f5lv == 0) {
										if (m3 >= 100) {
											m3 = m3 - 100;
											jLabel52
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv2.png")));
											f5lv = 1;
										}

									} else if (f5lv == 1) {
										if (m3 >= 100) {
											m3 = m3 - 100;
											jLabel52
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv3.png")));
											f5lv = 2;
										}

									}

								} else if (f5 == 1) {
									if (f5lv == 0) {
										m1 = m1 + 100;
										m3 = m3 - 100;
									} else if (f5lv == 1) {
										m1 = m1 + 200;
										m3 = m3 - 200;
									} else if (f5lv == 2) {
										m1 = m1 + 300;
										m3 = m3 - 300;
									}

								} else if (f5 == 2) {
									if (f5lv == 0) {
										m2 = m2 + 100;
										m3 = m3 - 100;
									} else if (f5lv == 1) {
										m2 = m2 + 200;
										m3 = m3 - 200;
									} else if (f5lv == 2) {
										m2 = m2 + 300;
										m3 = m3 - 300;
									}
								}
							}
							/*
							 * 6
							 */
							if (x3 == 634 && y3 == 400) {
								if (f6 == 0) {
									if (m3 >= 300) {
										m3 = m3 - 300;
										jLabel53
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/Lv1.png")));
										jLabel12
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/格子3.png")));

										f6 = 3;
									}

								} else if (f6 == 3) {
									if (f6lv == 0) {
										if (m3 >= 100) {
											m3 = m3 - 100;
											jLabel53
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv2.png")));
											f6lv = 1;
										}

									} else if (f6lv == 1) {
										if (m3 >= 100) {
											m3 = m3 - 100;
											jLabel53
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv3.png")));
											f6lv = 2;
										}

									}

								} else if (f6 == 1) {
									if (f6lv == 0) {
										m1 = m1 + 100;
										m3 = m3 - 100;
									} else if (f6lv == 1) {
										m1 = m1 + 200;
										m3 = m3 - 200;
									} else if (f6lv == 2) {
										m1 = m1 + 300;
										m3 = m3 - 300;
									}

								} else if (f6 == 2) {
									if (f1lv == 0) {
										m2 = m2 + 100;
										m3 = m3 - 100;
									} else if (f6lv == 1) {
										m2 = m2 + 200;
										m3 = m3 - 200;
									} else if (f6lv == 2) {
										m2 = m2 + 300;
										m3 = m3 - 300;
									}
								}
							}
							/*
							 * 7
							 */
							if (x3 == 546 && y3 == 540) {
								if (f7 == 0) {
									if (m3 >= 300) {
										m3 = m3 - 300;
										jLabel54
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/Lv1.png")));
										jLabel15
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/格子3.png")));

										f7 = 3;
									}

								} else if (f7 == 3) {
									if (f7lv == 0) {
										if (m3 >= 100) {
											m3 = m3 - 100;
											jLabel54
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv2.png")));
											f7lv = 1;
										}

									} else if (f7lv == 1) {
										if (m3 >= 100) {
											m3 = m3 - 100;
											jLabel54
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv3.png")));
											f7lv = 2;
										}

									}

								} else if (f7 == 1) {
									if (f7lv == 0) {
										m1 = m1 + 100;
										m3 = m3 - 100;
									} else if (f7lv == 1) {
										m1 = m1 + 200;
										m3 = m3 - 200;
									} else if (f7lv == 2) {
										m1 = m1 + 300;
										m3 = m3 - 300;
									}

								} else if (f7 == 2) {
									if (f7lv == 0) {
										m2 = m2 + 100;
										m3 = m3 - 100;
									} else if (f7lv == 1) {
										m2 = m2 + 200;
										m3 = m3 - 200;
									} else if (f7lv == 2) {
										m2 = m2 + 300;
										m3 = m3 - 300;
									}
								}
							}
							/*
							 * 8
							 */
							if (x3 == 458 && y3 == 540) {
								if (f8 == 0) {
									if (m3 >= 300) {
										m3 = m3 - 300;
										jLabel55
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/Lv1.png")));
										jLabel16
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/格子3.png")));

										f8 = 3;
									}

								} else if (f8 == 3) {
									if (f8lv == 0) {
										if (m3 >= 100) {
											m3 = m3 - 100;
											jLabel55
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv2.png")));
											f8lv = 1;
										}

									} else if (f8lv == 1) {
										if (m3 >= 100) {
											m3 = m3 - 100;
											jLabel54
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv3.png")));
											f8lv = 2;
										}

									}

								} else if (f8 == 1) {
									if (f8lv == 0) {
										m1 = m1 + 100;
										m3 = m3 - 100;
									} else if (f8lv == 1) {
										m1 = m1 + 200;
										m3 = m3 - 200;
									} else if (f8lv == 2) {
										m1 = m1 + 300;
										m3 = m3 - 300;
									}

								} else if (f8 == 2) {
									if (f8lv == 0) {
										m2 = m2 + 100;
										m3 = m3 - 100;
									} else if (f8lv == 1) {
										m2 = m2 + 200;
										m3 = m3 - 200;
									} else if (f8lv == 2) {
										m2 = m2 + 300;
										m3 = m3 - 300;
									}
								}
							}
							/*
							 * 9
							 */
							if (x3 == 370 && y3 == 540) {
								if (f9 == 0) {
									if (m3 >= 300) {
										m3 = m3 - 300;
										jLabel56
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/Lv1.png")));
										jLabel17
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/格子3.png")));

										f9 = 3;
									}

								} else if (f9 == 3) {
									if (f9lv == 0) {
										if (m3 >= 100) {
											m3 = m3 - 100;
											jLabel56
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv2.png")));
											f9lv = 1;
										}

									} else if (f9lv == 1) {
										if (m3 >= 100) {
											m3 = m3 - 100;
											jLabel56
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv3.png")));
											f9lv = 2;
										}

									}

								} else if (f9 == 1) {
									if (f9lv == 0) {
										m1 = m1 + 100;
										m3 = m3 - 100;
									} else if (f9lv == 1) {
										m1 = m1 + 200;
										m3 = m3 - 200;
									} else if (f9lv == 2) {
										m1 = m1 + 300;
										m3 = m3 - 300;
									}

								} else if (f9 == 2) {
									if (f9lv == 0) {
										m2 = m2 + 100;
										m3 = m3 - 100;
									} else if (f9lv == 1) {
										m2 = m2 + 200;
										m3 = m3 - 200;
									} else if (f9lv == 2) {
										m2 = m2 + 300;
										m3 = m3 - 300;
									}
								}
							}
							/*
							 * 10
							 */
							if (x3 == 194 && y3 == 540) {
								if (f10 == 0) {
									if (m3 >= 300) {
										m3 = m3 - 300;
										jLabel57
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/Lv1.png")));
										jLabel19
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/格子3.png")));

										f10 = 3;
									}

								} else if (f10 == 3) {
									if (f10lv == 0) {
										if (m3 >= 100) {
											m3 = m3 - 100;
											jLabel57
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv2.png")));
											f10lv = 1;
										}

									} else if (f10lv == 1) {
										if (m3 >= 100) {
											m3 = m3 - 100;
											jLabel57
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv3.png")));
											f10lv = 2;
										}

									}

								} else if (f10 == 1) {
									if (f10lv == 0) {
										m1 = m1 + 100;
										m3 = m3 - 100;
									} else if (f10lv == 1) {
										m1 = m1 + 200;
										m3 = m3 - 200;
									} else if (f10lv == 2) {
										m1 = m1 + 300;
										m3 = m3 - 300;
									}

								} else if (f10 == 2) {
									if (f10lv == 0) {
										m2 = m2 + 100;
										m3 = m3 - 100;
									} else if (f10lv == 1) {
										m2 = m2 + 200;
										m3 = m3 - 200;
									} else if (f10lv == 2) {
										m2 = m2 + 300;
										m3 = m3 - 300;
									}
								}
							}
							/*
							 * 11
							 */
							if (x3 == 106 && y3 == 470) {
								if (f11 == 0) {
									if (m3 >= 300) {
										m3 = m3 - 300;
										jLabel58
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/Lv1.png")));
										jLabel21
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/格子3.png")));

										f11 = 3;
									}

								} else if (f11 == 3) {
									if (f11lv == 0) {
										if (m3 >= 100) {
											m3 = m3 - 100;
											jLabel58
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv2.png")));
											f11lv = 1;
										}

									} else if (f11lv == 1) {
										if (m3 >= 100) {
											m3 = m3 - 100;
											jLabel58
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv3.png")));
											f11lv = 2;
										}

									}

								} else if (f11 == 1) {
									if (f11lv == 0) {
										m1 = m1 + 100;
										m3 = m3 - 100;
									} else if (f11lv == 1) {
										m1 = m1 + 200;
										m3 = m3 - 200;
									} else if (f11lv == 2) {
										m1 = m1 + 300;
										m3 = m3 - 300;
									}

								} else if (f11 == 2) {
									if (f11lv == 0) {
										m2 = m2 + 100;
										m3 = m3 - 100;
									} else if (f11lv == 1) {
										m2 = m2 + 200;
										m3 = m3 - 200;
									} else if (f11lv == 2) {
										m2 = m2 + 300;
										m3 = m3 - 300;
									}
								}
							}
							/*
							 * 12
							 */
							if (x3 == 106 && y3 == 330) {
								if (f12 == 0) {
									if (m3 >= 300) {
										m3 = m3 - 300;
										jLabel59
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/Lv1.png")));
										jLabel23
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/格子3.png")));

										f12 = 3;
									}

								} else if (f12 == 3) {
									if (f12lv == 0) {
										if (m3 >= 100) {
											m3 = m3 - 100;
											jLabel59
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv2.png")));
											f12lv = 1;
										}

									} else if (f12lv == 1) {
										if (m3 >= 100) {
											m3 = m3 - 100;
											jLabel59
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv3.png")));
											f12lv = 2;
										}

									}

								} else if (f12 == 1) {
									if (f12lv == 0) {
										m1 = m1 + 100;
										m3 = m3 - 100;
									} else if (f12lv == 1) {
										m1 = m1 + 200;
										m3 = m3 - 200;
									} else if (f12lv == 2) {
										m1 = m1 + 300;
										m3 = m3 - 300;
									}

								} else if (f12 == 2) {
									if (f12lv == 0) {
										m2 = m2 + 100;
										m3 = m3 - 100;
									} else if (f12lv == 1) {
										m2 = m2 + 200;
										m3 = m3 - 200;
									} else if (f12lv == 2) {
										m2 = m2 + 300;
										m3 = m3 - 300;
									}
								}
							}
							/*
							 * 13
							 */
							if (x3 == 106 && y3 == 260) {
								if (f13 == 0) {
									if (m3 >= 300) {
										m3 = m3 - 300;
										jLabel60
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/Lv1.png")));
										jLabel24
												.setIcon(new javax.swing.ImageIcon(
														getClass()
																.getResource(
																		"/images/格子3.png")));

										f13 = 3;
									}

								} else if (f13 == 3) {
									if (f13lv == 0) {
										if (m3 >= 100) {
											m3 = m3 - 100;
											jLabel60
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv2.png")));
											f13lv = 1;
										}

									} else if (f13lv == 1) {
										if (m3 >= 100) {
											m3 = m3 - 100;
											jLabel60
													.setIcon(new javax.swing.ImageIcon(
															getClass()
																	.getResource(
																			"/images/Lv3.png")));
											f13lv = 2;
										}

									}

								} else if (f13 == 1) {
									if (f13lv == 0) {
										m1 = m1 + 100;
										m3 = m3 - 100;
									} else if (f13lv == 1) {
										m1 = m1 + 200;
										m3 = m3 - 200;
									} else if (f13lv == 2) {
										m1 = m1 + 300;
										m3 = m3 - 300;
									}

								} else if (f13 == 2) {
									if (f13lv == 0) {
										m2 = m2 + 100;
										m3 = m3 - 100;
									} else if (f13lv == 1) {
										m2 = m2 + 200;
										m3 = m3 - 200;
									} else if (f13lv == 2) {
										m2 = m2 + 300;
										m3 = m3 - 300;
									}
								}
							}
							/*
							 * 随机事件格子
							 */
							if (x3 == 370 && y3 == 120) {
								Random r3 = new Random();
								int sj3 = r3.nextInt(2);
								if (sj3 == 0) {
									s3 = 1;
								} else if (sj3 == 1) {
									m3 = m3 + 300;
								} else if (sj3 == 2) {
									m3 = m3 - 100;
								}
							}
							/*
							 * 抽卡格子
							 */
							if (x3 == 634 && y3 == 120) {

							}
							/*
							 * 加钱格子
							 */
							if (x3 == 634 && y3 == 540) {
								m3 = m3 + 300;
							}
							/*
							 * 暂停格子
							 */
							if (x3 == 106 && y3 == 540) {
								s3 = 1;
							}
							/*
							 * 扣钱格子
							 */
							if (x3 == 106 && y3 == 400) {
								m3 = m3 - 100;
							}
							jTextField5.setText(Integer.toString(m3));

						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						order = 1;
					} else if (s3 == 1) {
						s3 = s3 - 1;
						order = 1;
					}

				}
			}
		}

	}

	class Play2 implements Runnable {

		@Override
		public void run() {
			try {
				Thread.sleep(500);
				Random random2 = new Random();
				int index2 = random2.nextInt(5);
				int move2 = index2 + 1;
				for (int i = 0; i < move2; i++) {

					if (106 <= x2 && x2 < 634 && y2 == 120) {
						x2 = x2 + 88;
						jLabel61.setBounds(x2, y2, 50, 50);
						continue;
					} else if (106 < x2 && x2 <= 634 && y2 == 540) {
						x2 = x2 - 88;
						jLabel61.setBounds(x2, y2, 50, 50);
						continue;
					} else if (120 <= y2 && y2 < 540 && x2 == 634) {
						y2 = y2 + 70;
						jLabel61.setBounds(x2, y2, 50, 50);
						continue;
					} else if (120 < y2 && y2 <= 540 && x2 == 106) {
						y2 = y2 - 70;
						jLabel61.setBounds(x2, y2, 50, 50);
						continue;
					}

				}
				/*
				 * 1
				 */
				if (x2 == 282 && y2 == 120) {
					if (f1 == 0) {
						if (m2 >= 300) {
							m2 = m2 - 300;
							jLabel48.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel4.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/格子2.png")));

							f1 = 2;
						}

					} else if (f1 == 2) {
						if (f1lv == 0) {
							if (m2 >= 100) {
								m2 = m2 - 100;
								jLabel48.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv2.png")));
								f1lv = 1;
							}

						} else if (f1lv == 1) {
							if (m2 >= 100) {
								m2 = m2 - 100;
								jLabel48.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv3.png")));
								f1lv = 2;
							}

						}

					} else if (f1 == 1) {
						if (f1lv == 0) {
							m1 = m1 + 100;
							m2 = m2 - 100;
						} else if (f1lv == 1) {
							m1 = m1 + 200;
							m2 = m2 - 200;
						} else if (f1lv == 2) {
							m1 = m1 + 300;
							m2 = m2 - 300;
						}

					} else if (f1 == 3) {
						if (f1lv == 0) {
							m2 = m2 - 100;
							m3 = m3 + 100;
						} else if (f1lv == 1) {
							m2 = m2 - 200;
							m3 = m3 + 200;
						} else if (f1lv == 2) {
							m2 = m2 - 300;
							m3 = m3 + 300;
						}
					}
				}
				/*
				 * 2
				 */
				if (x2 == 458 && y2 == 120) {
					if (f2 == 0) {
						if (m2 >= 300) {
							m2 = m2 - 300;
							jLabel49.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel6.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/格子2.png")));

							f2 = 2;
						}

					} else if (f2 == 2) {
						if (f2lv == 0) {
							if (m2 >= 100) {
								m2 = m2 - 100;
								jLabel49.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv2.png")));
								f2lv = 1;
							}

						} else if (f2lv == 1) {
							if (m2 >= 100) {
								m2 = m2 - 100;
								jLabel49.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv3.png")));
								f2lv = 2;
							}

						}

					} else if (f2 == 1) {
						if (f2lv == 0) {
							m1 = m1 + 100;
							m2 = m2 - 100;
						} else if (f2lv == 1) {
							m1 = m1 + 200;
							m2 = m2 - 200;
						} else if (f2lv == 2) {
							m1 = m1 + 300;
							m2 = m2 - 300;
						}

					} else if (f2 == 3) {
						if (f2lv == 0) {
							m2 = m2 - 100;
							m3 = m3 + 100;
						} else if (f2lv == 1) {
							m2 = m2 - 200;
							m3 = m3 + 200;
						} else if (f2lv == 2) {
							m2 = m2 - 300;
							m3 = m3 + 300;
						}
					}
				}
				/*
				 * 3
				 */
				if (x2 == 546 && y2 == 120) {
					if (f3 == 0) {
						if (m2 >= 300) {
							m2 = m2 - 300;
							jLabel50.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel7.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/格子2.png")));

							f3 = 2;
						}

					} else if (f3 == 2) {
						if (f3lv == 0) {
							if (m2 >= 100) {
								m2 = m2 - 100;
								jLabel50.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv2.png")));
								f3lv = 1;
							}

						} else if (f3lv == 1) {
							if (m2 >= 100) {
								m2 = m2 - 100;
								jLabel50.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv3.png")));
								f3lv = 2;
							}

						}

					} else if (f3 == 1) {
						if (f3lv == 0) {
							m1 = m1 + 100;
							m2 = m2 - 100;
						} else if (f3lv == 1) {
							m1 = m1 + 200;
							m2 = m2 - 200;
						} else if (f3lv == 2) {
							m1 = m1 + 300;
							m2 = m2 - 300;
						}

					} else if (f3 == 3) {
						if (f3lv == 0) {
							m2 = m2 - 100;
							m3 = m3 + 100;
						} else if (f3lv == 1) {
							m2 = m2 - 200;
							m3 = m3 + 200;
						} else if (f3lv == 2) {
							m2 = m2 - 300;
							m3 = m3 + 300;
						}
					}
				}
				/*
				 * 4
				 */
				if (x2 == 634 && y2 == 190) {
					if (f4 == 0) {
						if (m2 >= 300) {
							m2 = m2 - 300;
							jLabel51.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel9.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/格子2.png")));

							f4 = 2;
						}

					} else if (f4 == 2) {
						if (f4lv == 0) {
							if (m2 >= 100) {
								m2 = m2 - 100;
								jLabel51.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv2.png")));
								f4lv = 1;
							}

						} else if (f4lv == 1) {
							if (m2 >= 100) {
								m2 = m2 - 100;
								jLabel51.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv3.png")));
								f4lv = 2;
							}

						}

					} else if (f4 == 1) {
						if (f4lv == 0) {
							m1 = m1 + 100;
							m2 = m2 - 100;
						} else if (f4lv == 1) {
							m1 = m1 + 200;
							m2 = m2 - 200;
						} else if (f4lv == 2) {
							m1 = m1 + 300;
							m2 = m2 - 300;
						}

					} else if (f4 == 3) {
						if (f4lv == 0) {
							m2 = m2 - 100;
							m3 = m3 + 100;
						} else if (f4lv == 1) {
							m2 = m2 - 200;
							m3 = m3 + 200;
						} else if (f4lv == 2) {
							m2 = m2 - 300;
							m3 = m3 + 300;
						}
					}
				}
				/*
				 * 5
				 */
				if (x2 == 634 && y2 == 330) {
					if (f5 == 0) {
						if (m2 >= 300) {
							m2 = m2 - 300;
							jLabel52.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel11.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/格子2.png")));

							f5 = 2;
						}

					} else if (f5 == 2) {
						if (f5lv == 0) {
							if (m2 >= 100) {
								m2 = m2 - 100;
								jLabel52.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv2.png")));
								f5lv = 1;
							}

						} else if (f5lv == 1) {
							if (m2 >= 100) {
								m2 = m2 - 100;
								jLabel52.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv3.png")));
								f5lv = 2;
							}

						}

					} else if (f5 == 1) {
						if (f5lv == 0) {
							m1 = m1 + 100;
							m2 = m2 - 100;
						} else if (f5lv == 1) {
							m1 = m1 + 200;
							m2 = m2 - 200;
						} else if (f5lv == 2) {
							m1 = m1 + 300;
							m2 = m2 - 300;
						}

					} else if (f5 == 3) {
						if (f5lv == 0) {
							m2 = m2 - 100;
							m3 = m3 + 100;
						} else if (f5lv == 1) {
							m2 = m2 - 200;
							m3 = m3 + 200;
						} else if (f5lv == 2) {
							m2 = m2 - 300;
							m3 = m3 + 300;
						}
					}
				}
				/*
				 * 6
				 */
				if (x2 == 634 && y2 == 400) {
					if (f6 == 0) {
						if (m2 >= 300) {
							m2 = m2 - 300;
							jLabel53.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel12.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/格子2.png")));

							f6 = 2;
						}

					} else if (f6 == 2) {
						if (f6lv == 0) {
							if (m2 >= 100) {
								m2 = m2 - 100;
								jLabel53.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv2.png")));
								f6lv = 1;
							}

						} else if (f6lv == 1) {
							if (m2 >= 100) {
								m2 = m2 - 100;
								jLabel53.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv3.png")));
								f6lv = 2;
							}

						}

					} else if (f6 == 1) {
						if (f6lv == 0) {
							m1 = m1 + 100;
							m2 = m2 - 100;
						} else if (f6lv == 1) {
							m1 = m1 + 200;
							m2 = m2 - 200;
						} else if (f6lv == 2) {
							m1 = m1 + 300;
							m2 = m2 - 300;
						}

					} else if (f6 == 3) {
						if (f6lv == 0) {
							m2 = m2 - 100;
							m3 = m3 + 100;
						} else if (f6lv == 1) {
							m2 = m2 - 200;
							m3 = m3 + 200;
						} else if (f6lv == 2) {
							m2 = m2 - 300;
							m3 = m3 + 300;
						}
					}
				}
				/*
				 * 7
				 */
				if (x2 == 546 && y2 == 540) {
					if (f7 == 0) {
						if (m2 >= 300) {
							m2 = m2 - 300;
							jLabel54.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel15.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/格子2.png")));

							f7 = 2;
						}

					} else if (f7 == 2) {
						if (f7lv == 0) {
							if (m2 >= 100) {
								m2 = m2 - 100;
								jLabel54.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv2.png")));
								f7lv = 1;
							}

						} else if (f7lv == 1) {
							if (m2 >= 100) {
								m2 = m2 - 100;
								jLabel54.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv3.png")));
								f7lv = 2;
							}

						}

					} else if (f7 == 1) {
						if (f7lv == 0) {
							m1 = m1 + 100;
							m2 = m2 - 100;
						} else if (f7lv == 1) {
							m1 = m1 + 200;
							m2 = m2 - 200;
						} else if (f7lv == 2) {
							m1 = m1 + 300;
							m2 = m2 - 300;
						}

					} else if (f7 == 3) {
						if (f7lv == 0) {
							m2 = m2 - 100;
							m3 = m3 + 100;
						} else if (f7lv == 1) {
							m2 = m2 - 200;
							m3 = m3 + 200;
						} else if (f7lv == 2) {
							m2 = m2 - 300;
							m3 = m3 + 300;
						}
					}
				}
				/*
				 * 8
				 */
				if (x2 == 458 && y2 == 540) {
					if (f8 == 0) {
						if (m2 >= 300) {
							m2 = m2 - 300;
							jLabel55.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel16.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/格子2.png")));

							f8 = 2;
						}

					} else if (f8 == 2) {
						if (f8lv == 0) {
							if (m2 >= 100) {
								m2 = m2 - 100;
								jLabel55.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv2.png")));
								f8lv = 1;
							}

						} else if (f8lv == 1) {
							if (m2 >= 100) {
								m2 = m2 - 100;
								jLabel54.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv3.png")));
								f8lv = 2;
							}

						}

					} else if (f8 == 1) {
						if (f8lv == 0) {
							m1 = m1 + 100;
							m2 = m2 - 100;
						} else if (f8lv == 1) {
							m1 = m1 + 200;
							m2 = m2 - 200;
						} else if (f8lv == 2) {
							m1 = m1 + 300;
							m2 = m2 - 300;
						}

					} else if (f8 == 3) {
						if (f8lv == 0) {
							m2 = m2 - 100;
							m3 = m3 + 100;
						} else if (f8lv == 1) {
							m2 = m2 - 200;
							m3 = m3 + 200;
						} else if (f7lv == 2) {
							m2 = m2 - 300;
							m3 = m3 + 300;
						}
					}
				}
				/*
				 * 9
				 */
				if (x2 == 370 && y2 == 540) {
					if (f9 == 0) {
						if (m2 >= 300) {
							m2 = m2 - 300;
							jLabel56.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel17.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/格子2.png")));

							f9 = 2;
						}

					} else if (f9 == 2) {
						if (f9lv == 0) {
							if (m2 >= 100) {
								m2 = m2 - 100;
								jLabel56.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv2.png")));
								f9lv = 1;
							}

						} else if (f9lv == 1) {
							if (m2 >= 100) {
								m2 = m2 - 100;
								jLabel56.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv3.png")));
								f9lv = 2;
							}

						}

					} else if (f9 == 1) {
						if (f9lv == 0) {
							m1 = m1 + 100;
							m2 = m2 - 100;
						} else if (f9lv == 1) {
							m1 = m1 + 200;
							m2 = m2 - 200;
						} else if (f9lv == 2) {
							m1 = m1 + 300;
							m2 = m2 - 300;
						}

					} else if (f9 == 3) {
						if (f9lv == 0) {
							m2 = m2 - 100;
							m3 = m3 + 100;
						} else if (f9lv == 1) {
							m2 = m2 - 200;
							m3 = m3 + 200;
						} else if (f9lv == 2) {
							m2 = m2 - 300;
							m3 = m3 + 300;
						}
					}
				}
				/*
				 * 10
				 */
				if (x2 == 194 && y2 == 540) {
					if (f10 == 0) {
						if (m2 >= 300) {
							m2 = m2 - 300;
							jLabel57.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel19.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/格子2.png")));

							f10 = 2;
						}

					} else if (f10 == 2) {
						if (f10lv == 0) {
							if (m2 >= 100) {
								m2 = m2 - 100;
								jLabel57.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv2.png")));
								f10lv = 1;
							}

						} else if (f10lv == 1) {
							if (m2 >= 100) {
								m2 = m2 - 100;
								jLabel57.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv3.png")));
								f10lv = 2;
							}

						}

					} else if (f10 == 1) {
						if (f10lv == 0) {
							m1 = m1 + 100;
							m2 = m2 - 100;
						} else if (f10lv == 1) {
							m1 = m1 + 200;
							m2 = m2 - 200;
						} else if (f10lv == 2) {
							m1 = m1 + 300;
							m2 = m2 - 300;
						}

					} else if (f10 == 3) {
						if (f10lv == 0) {
							m2 = m2 - 100;
							m3 = m3 + 100;
						} else if (f10lv == 1) {
							m2 = m2 - 200;
							m3 = m3 + 200;
						} else if (f10lv == 2) {
							m2 = m2 - 300;
							m3 = m3 + 300;
						}
					}
				}
				/*
				 * 11
				 */
				if (x2 == 106 && y2 == 470) {
					if (f11 == 0) {
						if (m2 >= 300) {
							m2 = m2 - 300;
							jLabel58.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel21.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/格子2.png")));

							f11 = 2;
						}

					} else if (f11 == 2) {
						if (f11lv == 0) {
							if (m2 >= 100) {
								m2 = m2 - 100;
								jLabel58.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv2.png")));
								f11lv = 1;
							}

						} else if (f11lv == 1) {
							if (m2 >= 100) {
								m2 = m2 - 100;
								jLabel58.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv3.png")));
								f11lv = 2;
							}

						}

					} else if (f11 == 1) {
						if (f11lv == 0) {
							m1 = m1 + 100;
							m2 = m2 - 100;
						} else if (f11lv == 1) {
							m1 = m1 + 200;
							m2 = m2 - 200;
						} else if (f11lv == 2) {
							m1 = m1 + 300;
							m2 = m2 - 300;
						}

					} else if (f11 == 3) {
						if (f11lv == 0) {
							m2 = m2 - 100;
							m3 = m3 + 100;
						} else if (f11lv == 1) {
							m2 = m2 - 200;
							m3 = m3 + 200;
						} else if (f11lv == 2) {
							m2 = m2 - 300;
							m3 = m3 + 300;
						}
					}
				}
				/*
				 * 12
				 */
				if (x2 == 106 && y2 == 330) {
					if (f12 == 0) {
						if (m2 >= 300) {
							m2 = m2 - 300;
							jLabel59.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel23.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/格子2.png")));

							f12 = 2;
						}

					} else if (f12 == 2) {
						if (f12lv == 0) {
							if (m2 >= 100) {
								m2 = m2 - 100;
								jLabel59.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv2.png")));
								f12lv = 1;
							}

						} else if (f12lv == 1) {
							if (m2 >= 100) {
								m2 = m2 - 100;
								jLabel59.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv3.png")));
								f12lv = 2;
							}

						}

					} else if (f12 == 1) {
						if (f12lv == 0) {
							m1 = m1 + 100;
							m2 = m2 - 100;
						} else if (f12lv == 1) {
							m1 = m1 + 200;
							m2 = m2 - 200;
						} else if (f12lv == 2) {
							m1 = m1 + 300;
							m2 = m2 - 300;
						}

					} else if (f12 == 3) {
						if (f12lv == 0) {
							m2 = m2 - 100;
							m3 = m3 + 100;
						} else if (f12lv == 1) {
							m2 = m2 - 200;
							m3 = m3 + 200;
						} else if (f12lv == 2) {
							m2 = m2 - 300;
							m3 = m3 + 300;
						}
					}
				}
				/*
				 * 13
				 */
				if (x2 == 106 && y2 == 260) {
					if (f13 == 0) {
						if (m2 >= 300) {
							m2 = m2 - 300;
							jLabel60.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel24.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/格子2.png")));

							f13 = 2;
						}

					} else if (f13 == 2) {
						if (f13lv == 0) {
							if (m2 >= 100) {
								m2 = m2 - 100;
								jLabel60.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv2.png")));
								f13lv = 1;
							}

						} else if (f13lv == 1) {
							if (m2 >= 100) {
								m2 = m2 - 100;
								jLabel60.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv3.png")));
								f13lv = 2;
							}

						}

					} else if (f13 == 1) {
						if (f13lv == 0) {
							m1 = m1 + 100;
							m2 = m2 - 100;
						} else if (f13lv == 1) {
							m1 = m1 + 200;
							m2 = m2 - 200;
						} else if (f13lv == 2) {
							m1 = m1 + 300;
							m2 = m2 - 300;
						}

					} else if (f13 == 3) {
						if (f13lv == 0) {
							m2 = m2 - 100;
							m3 = m3 + 100;
						} else if (f13lv == 1) {
							m2 = m2 - 200;
							m3 = m3 + 200;
						} else if (f13lv == 2) {
							m2 = m2 - 300;
							m3 = m3 + 300;
						}
					}
				}
				/*
				 * 随机事件格子
				 */
				if (x2 == 370 && y2 == 120) {
					Random r2 = new Random();
					int sj2 = r2.nextInt(2);
					if (sj2 == 0) {
						s2 = 1;
					} else if (sj2 == 1) {
						m2 = m2 + 300;
					} else if (sj2 == 2) {
						m2 = m2 - 100;
					}
				}
				/*
				 * 抽卡格子
				 */
				if (x2 == 634 && y2 == 120) {

				}
				/*
				 * 加钱格子
				 */
				if (x2 == 634 && y2 == 540) {
					m2 = m2 + 300;
				}
				/*
				 * 暂停格子
				 */
				if (x2 == 106 && y2 == 540) {
					s2 = 1;
				}
				/*
				 * 扣钱格子
				 */
				if (x2 == 106 && y2 == 400) {
					m2 = m2 - 100;
				}
				jTextField3.setText(Integer.toString(m2));

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// TODO Auto-generated method stub

		}

	}

	class Play3 implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				Thread.sleep(1000);
				Random random3 = new Random();
				int index3 = random3.nextInt(5);
				int move3 = index3 + 1;
				for (int i = 0; i < move3; i++) {

					if (106 <= x3 && x3 < 634 && y3 == 120) {
						x3 = x3 + 88;
						jLabel62.setBounds(x3, y3, 50, 50);
						continue;
					}
					if (106 < x3 && x3 <= 634 && y3 == 540) {
						x3 = x3 - 88;
						jLabel62.setBounds(x3, y3, 50, 50);
						continue;
					}
					if (120 <= y3 && y3 < 540 && x3 == 634) {
						y3 = y3 + 70;
						jLabel62.setBounds(x3, y3, 50, 50);
						continue;
					}
					if (120 < y3 && y3 <= 540 && x3 == 106) {
						y3 = y3 - 70;
						jLabel62.setBounds(x3, y3, 50, 50);
						continue;
					}

				}
				/*
				 * 1
				 */
				if (x3 == 282 && y3 == 120) {
					if (f1 == 0) {
						if (m3 >= 300) {
							m3 = m3 - 300;
							jLabel48.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel4.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/格子3.png")));

							f1 = 3;
						}

					} else if (f1 == 3) {
						if (f1lv == 0) {
							if (m3 >= 100) {
								m3 = m3 - 100;
								jLabel48.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv2.png")));
								f1lv = 1;
							}

						} else if (f1lv == 1) {
							if (m3 >= 100) {
								m3 = m3 - 100;
								jLabel48.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv3.png")));
								f1lv = 2;
							}

						}

					} else if (f1 == 1) {
						if (f1lv == 0) {
							m1 = m1 + 100;
							m3 = m3 - 100;
						} else if (f1lv == 1) {
							m1 = m1 + 200;
							m3 = m3 - 200;
						} else if (f1lv == 2) {
							m1 = m1 + 300;
							m3 = m3 - 300;
						}

					} else if (f1 == 2) {
						if (f1lv == 0) {
							m2 = m2 + 100;
							m3 = m3 - 100;
						} else if (f1lv == 1) {
							m2 = m2 + 200;
							m3 = m3 - 200;
						} else if (f1lv == 2) {
							m2 = m2 + 300;
							m3 = m3 - 300;
						}
					}
				}
				/*
				 * 2
				 */
				if (x3 == 458 && y3 == 120) {
					if (f2 == 0) {
						if (m3 >= 300) {
							m3 = m3 - 300;
							jLabel49.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel6.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/格子3.png")));

							f2 = 3;
						}

					} else if (f2 == 3) {
						if (f2lv == 0) {
							if (m3 >= 100) {
								m3 = m3 - 100;
								jLabel49.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv2.png")));
								f2lv = 1;
							}

						} else if (f2lv == 1) {
							if (m3 >= 100) {
								m3 = m3 - 100;
								jLabel49.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv3.png")));
								f2lv = 2;
							}

						}

					} else if (f2 == 1) {
						if (f2lv == 0) {
							m1 = m1 + 100;
							m3 = m3 - 100;
						} else if (f2lv == 1) {
							m1 = m1 + 200;
							m3 = m3 - 200;
						} else if (f2lv == 2) {
							m1 = m1 + 300;
							m3 = m3 - 300;
						}

					} else if (f2 == 2) {
						if (f2lv == 0) {
							m2 = m2 + 100;
							m3 = m3 - 100;
						} else if (f2lv == 1) {
							m2 = m2 + 200;
							m3 = m3 - 200;
						} else if (f2lv == 2) {
							m2 = m2 + 300;
							m3 = m3 - 300;
						}
					}
				}
				/*
				 * 3
				 */
				if (x3 == 546 && y3 == 120) {
					if (f3 == 0) {
						if (m3 >= 300) {
							m3 = m3 - 300;
							jLabel50.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel7.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/格子3.png")));

							f3 = 3;
						}

					} else if (f3 == 3) {
						if (f3lv == 0) {
							if (m3 >= 100) {
								m3 = m3 - 100;
								jLabel50.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv2.png")));
								f3lv = 1;
							}

						} else if (f3lv == 1) {
							if (m3 >= 100) {
								m3 = m3 - 100;
								jLabel50.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv3.png")));
								f3lv = 2;
							}

						}

					} else if (f3 == 1) {
						if (f3lv == 0) {
							m1 = m1 + 100;
							m3 = m3 - 100;
						} else if (f3lv == 1) {
							m1 = m1 + 200;
							m3 = m3 - 200;
						} else if (f3lv == 2) {
							m1 = m1 + 300;
							m3 = m3 - 300;
						}

					} else if (f3 == 2) {
						if (f3lv == 0) {
							m2 = m2 + 100;
							m3 = m3 - 100;
						} else if (f3lv == 1) {
							m2 = m2 + 200;
							m3 = m3 - 200;
						} else if (f3lv == 2) {
							m2 = m2 + 300;
							m3 = m3 - 300;
						}
					}
				}
				/*
				 * 4
				 */
				if (x3 == 634 && y3 == 190) {
					if (f4 == 0) {
						if (m3 >= 300) {
							m3 = m3 - 300;
							jLabel51.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel9.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/格子3.png")));

							f4 = 3;
						}

					} else if (f4 == 3) {
						if (f4lv == 0) {
							if (m3 >= 100) {
								m3 = m3 - 100;
								jLabel51.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv2.png")));
								f4lv = 1;
							}

						} else if (f4lv == 1) {
							if (m3 >= 100) {
								m3 = m3 - 100;
								jLabel51.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv3.png")));
								f4lv = 2;
							}

						}

					} else if (f4 == 1) {
						if (f4lv == 0) {
							m1 = m1 + 100;
							m3 = m3 - 100;
						} else if (f4lv == 1) {
							m1 = m1 + 200;
							m3 = m3 - 200;
						} else if (f4lv == 2) {
							m1 = m1 + 300;
							m3 = m3 - 300;
						}

					} else if (f4 == 2) {
						if (f4lv == 0) {
							m2 = m2 + 100;
							m3 = m3 - 100;
						} else if (f4lv == 1) {
							m2 = m2 + 200;
							m3 = m3 - 200;
						} else if (f4lv == 2) {
							m2 = m2 + 300;
							m3 = m3 - 300;
						}
					}
				}
				/*
				 * 5
				 */
				if (x3 == 634 && y3 == 330) {
					if (f3 == 0) {
						if (m3 >= 300) {
							m3 = m3 - 300;
							jLabel52.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel11.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/格子3.png")));

							f5 = 3;
						}

					} else if (f5 == 3) {
						if (f5lv == 0) {
							if (m3 >= 100) {
								m3 = m3 - 100;
								jLabel52.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv2.png")));
								f5lv = 1;
							}

						} else if (f5lv == 1) {
							if (m3 >= 100) {
								m3 = m3 - 100;
								jLabel52.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv3.png")));
								f5lv = 2;
							}

						}

					} else if (f5 == 1) {
						if (f5lv == 0) {
							m1 = m1 + 100;
							m3 = m3 - 100;
						} else if (f5lv == 1) {
							m1 = m1 + 200;
							m3 = m3 - 200;
						} else if (f5lv == 2) {
							m1 = m1 + 300;
							m3 = m3 - 300;
						}

					} else if (f5 == 2) {
						if (f5lv == 0) {
							m2 = m2 + 100;
							m3 = m3 - 100;
						} else if (f5lv == 1) {
							m2 = m2 + 200;
							m3 = m3 - 200;
						} else if (f5lv == 2) {
							m2 = m2 + 300;
							m3 = m3 - 300;
						}
					}
				}
				/*
				 * 6
				 */
				if (x3 == 634 && y3 == 400) {
					if (f6 == 0) {
						if (m3 >= 300) {
							m3 = m3 - 300;
							jLabel53.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel12.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/格子3.png")));

							f6 = 3;
						}

					} else if (f6 == 3) {
						if (f6lv == 0) {
							if (m3 >= 100) {
								m3 = m3 - 100;
								jLabel53.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv2.png")));
								f6lv = 1;
							}

						} else if (f6lv == 1) {
							if (m3 >= 100) {
								m3 = m3 - 100;
								jLabel53.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv3.png")));
								f6lv = 2;
							}

						}

					} else if (f6 == 1) {
						if (f6lv == 0) {
							m1 = m1 + 100;
							m3 = m3 - 100;
						} else if (f6lv == 1) {
							m1 = m1 + 200;
							m3 = m3 - 200;
						} else if (f6lv == 2) {
							m1 = m1 + 300;
							m3 = m3 - 300;
						}

					} else if (f6 == 2) {
						if (f1lv == 0) {
							m2 = m2 + 100;
							m3 = m3 - 100;
						} else if (f6lv == 1) {
							m2 = m2 + 200;
							m3 = m3 - 200;
						} else if (f6lv == 2) {
							m2 = m2 + 300;
							m3 = m3 - 300;
						}
					}
				}
				/*
				 * 7
				 */
				if (x3 == 546 && y3 == 540) {
					if (f7 == 0) {
						if (m3 >= 300) {
							m3 = m3 - 300;
							jLabel54.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel15.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/格子3.png")));

							f7 = 3;
						}

					} else if (f7 == 3) {
						if (f7lv == 0) {
							if (m3 >= 100) {
								m3 = m3 - 100;
								jLabel54.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv2.png")));
								f7lv = 1;
							}

						} else if (f7lv == 1) {
							if (m3 >= 100) {
								m3 = m3 - 100;
								jLabel54.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv3.png")));
								f7lv = 2;
							}

						}

					} else if (f7 == 1) {
						if (f7lv == 0) {
							m1 = m1 + 100;
							m3 = m3 - 100;
						} else if (f7lv == 1) {
							m1 = m1 + 200;
							m3 = m3 - 200;
						} else if (f7lv == 2) {
							m1 = m1 + 300;
							m3 = m3 - 300;
						}

					} else if (f7 == 2) {
						if (f7lv == 0) {
							m2 = m2 + 100;
							m3 = m3 - 100;
						} else if (f7lv == 1) {
							m2 = m2 + 200;
							m3 = m3 - 200;
						} else if (f7lv == 2) {
							m2 = m2 + 300;
							m3 = m3 - 300;
						}
					}
				}
				/*
				 * 8
				 */
				if (x3 == 458 && y3 == 540) {
					if (f8 == 0) {
						if (m3 >= 300) {
							m3 = m3 - 300;
							jLabel55.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel16.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/格子3.png")));

							f8 = 3;
						}

					} else if (f8 == 3) {
						if (f8lv == 0) {
							if (m3 >= 100) {
								m3 = m3 - 100;
								jLabel55.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv2.png")));
								f8lv = 1;
							}

						} else if (f8lv == 1) {
							if (m3 >= 100) {
								m3 = m3 - 100;
								jLabel54.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv3.png")));
								f8lv = 2;
							}

						}

					} else if (f8 == 1) {
						if (f8lv == 0) {
							m1 = m1 + 100;
							m3 = m3 - 100;
						} else if (f8lv == 1) {
							m1 = m1 + 200;
							m3 = m3 - 200;
						} else if (f8lv == 2) {
							m1 = m1 + 300;
							m3 = m3 - 300;
						}

					} else if (f8 == 2) {
						if (f8lv == 0) {
							m2 = m2 + 100;
							m3 = m3 - 100;
						} else if (f8lv == 1) {
							m2 = m2 + 200;
							m3 = m3 - 200;
						} else if (f8lv == 2) {
							m2 = m2 + 300;
							m3 = m3 - 300;
						}
					}
				}
				/*
				 * 9
				 */
				if (x3 == 370 && y3 == 540) {
					if (f9 == 0) {
						if (m3 >= 300) {
							m3 = m3 - 300;
							jLabel56.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel17.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/格子3.png")));

							f9 = 3;
						}

					} else if (f9 == 3) {
						if (f9lv == 0) {
							if (m3 >= 100) {
								m3 = m3 - 100;
								jLabel56.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv2.png")));
								f9lv = 1;
							}

						} else if (f9lv == 1) {
							if (m3 >= 100) {
								m3 = m3 - 100;
								jLabel56.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv3.png")));
								f9lv = 2;
							}

						}

					} else if (f9 == 1) {
						if (f9lv == 0) {
							m1 = m1 + 100;
							m3 = m3 - 100;
						} else if (f9lv == 1) {
							m1 = m1 + 200;
							m3 = m3 - 200;
						} else if (f9lv == 2) {
							m1 = m1 + 300;
							m3 = m3 - 300;
						}

					} else if (f9 == 2) {
						if (f9lv == 0) {
							m2 = m2 + 100;
							m3 = m3 - 100;
						} else if (f9lv == 1) {
							m2 = m2 + 200;
							m3 = m3 - 200;
						} else if (f9lv == 2) {
							m2 = m2 + 300;
							m3 = m3 - 300;
						}
					}
				}
				/*
				 * 10
				 */
				if (x3 == 194 && y3 == 540) {
					if (f10 == 0) {
						if (m3 >= 300) {
							m3 = m3 - 300;
							jLabel57.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel19.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/格子3.png")));

							f10 = 3;
						}

					} else if (f10 == 3) {
						if (f10lv == 0) {
							if (m3 >= 100) {
								m3 = m3 - 100;
								jLabel57.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv2.png")));
								f10lv = 1;
							}

						} else if (f10lv == 1) {
							if (m3 >= 100) {
								m3 = m3 - 100;
								jLabel57.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv3.png")));
								f10lv = 2;
							}

						}

					} else if (f10 == 1) {
						if (f10lv == 0) {
							m1 = m1 + 100;
							m3 = m3 - 100;
						} else if (f10lv == 1) {
							m1 = m1 + 200;
							m3 = m3 - 200;
						} else if (f10lv == 2) {
							m1 = m1 + 300;
							m3 = m3 - 300;
						}

					} else if (f10 == 2) {
						if (f10lv == 0) {
							m2 = m2 + 100;
							m3 = m3 - 100;
						} else if (f10lv == 1) {
							m2 = m2 + 200;
							m3 = m3 - 200;
						} else if (f10lv == 2) {
							m2 = m2 + 300;
							m3 = m3 - 300;
						}
					}
				}
				/*
				 * 11
				 */
				if (x3 == 106 && y3 == 470) {
					if (f11 == 0) {
						if (m3 >= 300) {
							m3 = m3 - 300;
							jLabel58.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel21.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/格子3.png")));

							f11 = 3;
						}

					} else if (f11 == 3) {
						if (f11lv == 0) {
							if (m3 >= 100) {
								m3 = m3 - 100;
								jLabel58.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv2.png")));
								f11lv = 1;
							}

						} else if (f11lv == 1) {
							if (m3 >= 100) {
								m3 = m3 - 100;
								jLabel58.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv3.png")));
								f11lv = 2;
							}

						}

					} else if (f11 == 1) {
						if (f11lv == 0) {
							m1 = m1 + 100;
							m3 = m3 - 100;
						} else if (f11lv == 1) {
							m1 = m1 + 200;
							m3 = m3 - 200;
						} else if (f11lv == 2) {
							m1 = m1 + 300;
							m3 = m3 - 300;
						}

					} else if (f11 == 2) {
						if (f11lv == 0) {
							m2 = m2 + 100;
							m3 = m3 - 100;
						} else if (f11lv == 1) {
							m2 = m2 + 200;
							m3 = m3 - 200;
						} else if (f11lv == 2) {
							m2 = m2 + 300;
							m3 = m3 - 300;
						}
					}
				}
				/*
				 * 12
				 */
				if (x3 == 106 && y3 == 330) {
					if (f12 == 0) {
						if (m3 >= 300) {
							m3 = m3 - 300;
							jLabel59.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel23.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/格子3.png")));

							f12 = 3;
						}

					} else if (f12 == 3) {
						if (f12lv == 0) {
							if (m3 >= 100) {
								m3 = m3 - 100;
								jLabel59.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv2.png")));
								f12lv = 1;
							}

						} else if (f12lv == 1) {
							if (m3 >= 100) {
								m3 = m3 - 100;
								jLabel59.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv3.png")));
								f12lv = 2;
							}

						}

					} else if (f12 == 1) {
						if (f12lv == 0) {
							m1 = m1 + 100;
							m3 = m3 - 100;
						} else if (f12lv == 1) {
							m1 = m1 + 200;
							m3 = m3 - 200;
						} else if (f12lv == 2) {
							m1 = m1 + 300;
							m3 = m3 - 300;
						}

					} else if (f12 == 2) {
						if (f12lv == 0) {
							m2 = m2 + 100;
							m3 = m3 - 100;
						} else if (f12lv == 1) {
							m2 = m2 + 200;
							m3 = m3 - 200;
						} else if (f12lv == 2) {
							m2 = m2 + 300;
							m3 = m3 - 300;
						}
					}
				}
				/*
				 * 13
				 */
				if (x3 == 106 && y3 == 260) {
					if (f13 == 0) {
						if (m3 >= 300) {
							m3 = m3 - 300;
							jLabel60.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel24.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/格子3.png")));

							f13 = 3;
						}

					} else if (f13 == 3) {
						if (f13lv == 0) {
							if (m3 >= 100) {
								m3 = m3 - 100;
								jLabel60.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv2.png")));
								f13lv = 1;
							}

						} else if (f13lv == 1) {
							if (m3 >= 100) {
								m3 = m3 - 100;
								jLabel60.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv3.png")));
								f13lv = 2;
							}

						}

					} else if (f13 == 1) {
						if (f13lv == 0) {
							m1 = m1 + 100;
							m3 = m3 - 100;
						} else if (f13lv == 1) {
							m1 = m1 + 200;
							m3 = m3 - 200;
						} else if (f13lv == 2) {
							m1 = m1 + 300;
							m3 = m3 - 300;
						}

					} else if (f13 == 2) {
						if (f13lv == 0) {
							m2 = m2 + 100;
							m3 = m3 - 100;
						} else if (f13lv == 1) {
							m2 = m2 + 200;
							m3 = m3 - 200;
						} else if (f13lv == 2) {
							m2 = m2 + 300;
							m3 = m3 - 300;
						}
					}
				}
				/*
				 * 随机事件格子
				 */
				if (x3 == 370 && y3 == 120) {
					Random r3 = new Random();
					int sj3 = r3.nextInt(2);
					if (sj3 == 0) {
						s3 = 1;
					} else if (sj3 == 1) {
						m3 = m3 + 300;
					} else if (sj3 == 2) {
						m3 = m3 - 100;
					}
				}
				/*
				 * 抽卡格子
				 */
				if (x3 == 634 && y3 == 120) {

				}
				/*
				 * 加钱格子
				 */
				if (x3 == 634 && y3 == 540) {
					m3 = m3 + 300;
				}
				/*
				 * 暂停格子
				 */
				if (x3 == 106 && y3 == 540) {
					s3 = 1;
				}
				/*
				 * 扣钱格子
				 */
				if (x3 == 106 && y3 == 400) {
					m3 = m3 - 100;
				}
				jTextField5.setText(Integer.toString(m3));

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel26 = new javax.swing.JLabel();
		jLabel61 = new javax.swing.JLabel();
		jLabel62 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jTextField1 = new javax.swing.JTextField();
		jTextField3 = new javax.swing.JTextField();
		jTextField5 = new javax.swing.JTextField();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jLabel12 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		jLabel14 = new javax.swing.JLabel();
		jLabel15 = new javax.swing.JLabel();
		jLabel16 = new javax.swing.JLabel();
		jLabel17 = new javax.swing.JLabel();
		jLabel18 = new javax.swing.JLabel();
		jLabel19 = new javax.swing.JLabel();
		jLabel20 = new javax.swing.JLabel();
		jLabel21 = new javax.swing.JLabel();
		jLabel22 = new javax.swing.JLabel();
		jLabel23 = new javax.swing.JLabel();
		jLabel24 = new javax.swing.JLabel();
		jLabel25 = new javax.swing.JLabel();
		jLabel48 = new javax.swing.JLabel();
		jLabel49 = new javax.swing.JLabel();
		jLabel50 = new javax.swing.JLabel();
		jLabel51 = new javax.swing.JLabel();
		jLabel52 = new javax.swing.JLabel();
		jLabel53 = new javax.swing.JLabel();
		jLabel54 = new javax.swing.JLabel();
		jLabel55 = new javax.swing.JLabel();
		jLabel56 = new javax.swing.JLabel();
		jLabel57 = new javax.swing.JLabel();
		jLabel58 = new javax.swing.JLabel();
		jLabel59 = new javax.swing.JLabel();
		jLabel60 = new javax.swing.JLabel();
		jButton5 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setUndecorated(true);

		jPanel1.setLayout(null);

		jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/太监.png"))); // NOI18N
		jPanel1.add(jLabel26);
		jLabel26.setBounds(110, 110, 50, 50);

		jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/妃子.png"))); // NOI18N
		jPanel1.add(jLabel61);
		jLabel61.setBounds(80, 110, 30, 50);

		jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/宫女.png"))); // NOI18N
		jPanel1.add(jLabel62);
		jLabel62.setBounds(50, 110, 30, 50);

		jButton1.setBackground(new java.awt.Color(255, 255, 255));
		jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/色子按钮.png"))); // NOI18N
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton1);
		jButton1.setBounds(350, 450, 80, 70);

		jTextField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField1ActionPerformed(evt);
			}
		});
		jPanel1.add(jTextField1);
		jTextField1.setBounds(70, 30, 86, 20);
		jPanel1.add(jTextField3);
		jTextField3.setBounds(240, 30, 80, 20);

		jTextField5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField5ActionPerformed(evt);
			}
		});
		jPanel1.add(jTextField5);
		jTextField5.setBounds(410, 30, 80, 20);

		jButton2.setBackground(new java.awt.Color(255, 255, 255));
		jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/托管按钮.png"))); // NOI18N
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton2);
		jButton2.setBounds(0, 670, 70, 40);

		jButton3.setBackground(new java.awt.Color(255, 255, 255));
		jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/×按钮.png"))); // NOI18N
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton3);
		jButton3.setBounds(750, 10, 40, 40);

		jButton4.setBackground(new java.awt.Color(255, 255, 255));
		jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/卡片按钮.png"))); // NOI18N
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton4);
		jButton4.setBounds(80, 670, 90, 40);

		jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/地图一棋子.png"))); // NOI18N
		jPanel1.add(jLabel2);
		jLabel2.setBounds(106, 120, 60, 50);

		jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/地图一棋子.png"))); // NOI18N
		jPanel1.add(jLabel3);
		jLabel3.setBounds(190, 120, 60, 50);

		jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/地图一棋子.png"))); // NOI18N
		jPanel1.add(jLabel4);
		jLabel4.setBounds(282, 120, 60, 50);

		jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/地图一棋子.png"))); // NOI18N
		jPanel1.add(jLabel5);
		jLabel5.setBounds(370, 120, 60, 50);

		jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/地图一棋子.png"))); // NOI18N
		jPanel1.add(jLabel6);
		jLabel6.setBounds(458, 120, 60, 50);

		jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/地图一棋子.png"))); // NOI18N
		jPanel1.add(jLabel7);
		jLabel7.setBounds(546, 120, 60, 50);

		jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/地图一棋子.png"))); // NOI18N
		jPanel1.add(jLabel8);
		jLabel8.setBounds(634, 120, 60, 50);

		jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/地图一棋子.png"))); // NOI18N
		jPanel1.add(jLabel9);
		jLabel9.setBounds(634, 190, 60, 50);

		jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/地图一棋子.png"))); // NOI18N
		jPanel1.add(jLabel10);
		jLabel10.setBounds(634, 260, 60, 50);

		jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/地图一棋子.png"))); // NOI18N
		jPanel1.add(jLabel11);
		jLabel11.setBounds(634, 330, 60, 50);

		jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/地图一棋子.png"))); // NOI18N
		jPanel1.add(jLabel12);
		jLabel12.setBounds(634, 400, 60, 50);

		jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/地图一棋子.png"))); // NOI18N
		jPanel1.add(jLabel13);
		jLabel13.setBounds(634, 470, 60, 50);

		jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/地图一棋子.png"))); // NOI18N
		jPanel1.add(jLabel14);
		jLabel14.setBounds(634, 540, 60, 50);

		jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/地图一棋子.png"))); // NOI18N
		jPanel1.add(jLabel15);
		jLabel15.setBounds(546, 540, 60, 50);

		jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/地图一棋子.png"))); // NOI18N
		jPanel1.add(jLabel16);
		jLabel16.setBounds(458, 540, 60, 50);

		jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/地图一棋子.png"))); // NOI18N
		jPanel1.add(jLabel17);
		jLabel17.setBounds(370, 540, 60, 50);

		jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/地图一棋子.png"))); // NOI18N
		jPanel1.add(jLabel18);
		jLabel18.setBounds(282, 540, 60, 50);

		jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/地图一棋子.png"))); // NOI18N
		jPanel1.add(jLabel19);
		jLabel19.setBounds(194, 540, 60, 50);

		jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/地图一棋子.png"))); // NOI18N
		jPanel1.add(jLabel20);
		jLabel20.setBounds(106, 540, 60, 50);

		jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/地图一棋子.png"))); // NOI18N
		jPanel1.add(jLabel21);
		jLabel21.setBounds(106, 470, 60, 50);

		jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/地图一棋子.png"))); // NOI18N
		jPanel1.add(jLabel22);
		jLabel22.setBounds(106, 400, 60, 50);

		jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/地图一棋子.png"))); // NOI18N
		jPanel1.add(jLabel23);
		jLabel23.setBounds(106, 330, 60, 50);

		jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/地图一棋子.png"))); // NOI18N
		jPanel1.add(jLabel24);
		jLabel24.setBounds(106, 260, 60, 50);

		jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/地图一棋子.png"))); // NOI18N
		jPanel1.add(jLabel25);
		jLabel25.setBounds(106, 190, 60, 50);
		jPanel1.add(jLabel48);
		jLabel48.setBounds(290, 60, 50, 49);
		jPanel1.add(jLabel49);
		jLabel49.setBounds(460, 60, 50, 49);
		jPanel1.add(jLabel50);
		jLabel50.setBounds(550, 60, 50, 49);
		jPanel1.add(jLabel51);
		jLabel51.setBounds(700, 200, 50, 49);
		jPanel1.add(jLabel52);
		jLabel52.setBounds(700, 340, 50, 49);
		jPanel1.add(jLabel53);
		jLabel53.setBounds(700, 410, 50, 49);
		jPanel1.add(jLabel54);
		jLabel54.setBounds(560, 620, 50, 49);
		jPanel1.add(jLabel55);
		jLabel55.setBounds(460, 620, 50, 49);
		jPanel1.add(jLabel56);
		jLabel56.setBounds(380, 620, 50, 49);
		jPanel1.add(jLabel57);
		jLabel57.setBounds(190, 610, 50, 49);
		jPanel1.add(jLabel58);
		jLabel58.setBounds(50, 490, 50, 49);
		jPanel1.add(jLabel59);
		jLabel59.setBounds(50, 340, 50, 49);
		jPanel1.add(jLabel60);
		jLabel60.setBounds(50, 270, 50, 49);

		jButton5.setBackground(new java.awt.Color(255, 255, 255));
		jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/取消托管.png"))); // NOI18N
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton5);
		jButton5.setBounds(180, 670, 80, 40);

		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/地图一.png"))); // NOI18N
		jPanel1.add(jLabel1);
		jLabel1.setBounds(-10, -10, 820, 740);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 803,
				Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 714,
				Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		t = 0;
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		new Card1View().setVisible(true);
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		t = 1;
		Play1 a = new Play1();
		Thread d = new Thread(a);
		d.start();

	}

	private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		this.dispose();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		
		order = 1;
		switch (order) {
		case 1:
			if (s1 == 0) {
				Random random = new Random();
				int index = random.nextInt(5);
				int move = index + 1;
				JOptionPane.showMessageDialog(null, "前进" + move + "格", "提示",
						JOptionPane.CANCEL_OPTION);

				for (int i = 0; i < move; i++) {

					if (106 <= x1 && x1 < 634 && y1 == 120) {

						x1 = x1 + 88;
						jLabel26.setBounds(jLabel26.getX() + 88, jLabel26
								.getY(), 50, 50);
						continue;

					} else if (106 < x1 && x1 <= 634 && y1 == 540) {
						x1 = x1 - 88;
						jLabel26.setBounds(jLabel26.getX() - 88, jLabel26
								.getY(), 50, 50);
						continue;

					} else if (120 <= y1 && y1 < 540 && x1 == 634) {
						y1 = y1 + 70;
						jLabel26.setBounds(jLabel26.getX(),
								jLabel26.getY() + 70, 50, 50);
						continue;

					} else if (120 < y1 && y1 <= 540 && x1 == 106) {
						y1 = y1 - 70;
						jLabel26.setBounds(jLabel26.getX(),
								jLabel26.getY() - 70, 50, 50);
						continue;

					}

				}

				/*
				 * 1
				 */
				if (x1 == 282 && y1 == 120) {
					if (f1 == 0) {
						int res = JOptionPane.showConfirmDialog(null, "是否购买房子",
								"购买房子", JOptionPane.YES_NO_OPTION);
						if (res == JOptionPane.YES_OPTION) {
							m1 = m1 - 300;
							jLabel48.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel4.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/格子1.png")));
							f1 = 1;
						} else {
							f1 = 0;
							return;
						}

					} else if (f1 == 1) {
						if (f1lv == 0) {
							int res = JOptionPane
									.showConfirmDialog(null, "是否升级房子", "升级房子",
											JOptionPane.YES_NO_OPTION);
							if (res == JOptionPane.YES_OPTION) {
								m1 = m1 - 100;
								jLabel48.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv2.png")));
								f1lv = 1;
							} else {
								return;
							}

						} else if (f1lv == 1) {
							int res = JOptionPane
									.showConfirmDialog(null, "是否升级房子", "升级房子",
											JOptionPane.YES_NO_OPTION);
							if (res == JOptionPane.YES_OPTION) {
								m1 = m1 - 100;
								jLabel48.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv3.png")));
								f1lv = 2;
							} else {
								return;
							}

						}

					} else if (f1 == 2) {
						if (f1lv == 0) {
							m1 = m1 - 100;
							m2 = m2 + 100;
						} else if (f1lv == 1) {
							m1 = m1 - 200;
							m2 = m2 + 200;
						} else if (f1lv == 2) {
							m1 = m1 - 300;
							m2 = m2 + 300;
						}

					} else if (f1 == 3) {
						if (f1lv == 0) {
							m1 = m1 - 100;
							m3 = m3 + 100;
						} else if (f1lv == 1) {
							m1 = m1 - 200;
							m3 = m3 + 200;
						} else if (f1lv == 2) {
							m1 = m1 - 300;
							m3 = m3 + 300;
						}

					}
				}
				/*
				 * 2
				 */
				if (x1 == 458 && y1 == 120) {
					if (f2 == 0) {
						int res = JOptionPane.showConfirmDialog(null, "是否购买房子",
								"购买房子", JOptionPane.YES_NO_OPTION);
						if (res == JOptionPane.YES_OPTION) {
							m1 = m1 - 300;
							jLabel49.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel6.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/格子1.png")));
							f2 = 1;
						} else {
							f2 = 0;
							return;
						}

					} else if (f2 == 1) {
						if (f2lv == 0) {
							int res = JOptionPane
									.showConfirmDialog(null, "是否升级房子", "升级房子",
											JOptionPane.YES_NO_OPTION);
							if (res == JOptionPane.YES_OPTION) {
								m1 = m1 - 100;
								jLabel49.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv2.png")));
								f2lv = 1;
							} else {
								return;
							}

						} else if (f2lv == 1) {
							int res = JOptionPane
									.showConfirmDialog(null, "是否升级房子", "升级房子",
											JOptionPane.YES_NO_OPTION);
							if (res == JOptionPane.YES_OPTION) {
								m1 = m1 - 100;
								jLabel49.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv3.png")));
								f2lv = 2;
							} else {
								return;
							}

						}

					} else if (f2 == 2) {
						if (f2lv == 0) {
							m1 = m1 - 100;
							m2 = m2 + 100;
						} else if (f2lv == 1) {
							m1 = m1 - 200;
							m2 = m2 + 200;
						} else if (f2lv == 2) {
							m1 = m1 - 300;
							m2 = m2 + 300;
						}

					} else if (f2 == 3) {
						if (f2lv == 0) {
							m1 = m1 - 100;
							m3 = m3 + 100;
						} else if (f2lv == 1) {
							m1 = m1 - 200;
							m3 = m3 + 200;
						} else if (f2lv == 2) {
							m1 = m1 - 300;
							m3 = m3 + 300;
						}

					}
				}
				/*
				 * 3
				 */
				if (x1 == 546 && y1 == 120) {
					if (f3 == 0) {
						int res = JOptionPane.showConfirmDialog(null, "是否购买房子",
								"购买房子", JOptionPane.YES_NO_OPTION);
						if (res == JOptionPane.YES_OPTION) {
							m1 = m1 - 300;
							jLabel50.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel7.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/格子1.png")));
							f3 = 1;
						} else {
							f3 = 0;
							return;
						}

					} else if (f3 == 1) {
						if (f3lv == 0) {
							int res = JOptionPane
									.showConfirmDialog(null, "是否升级房子", "升级房子",
											JOptionPane.YES_NO_OPTION);
							if (res == JOptionPane.YES_OPTION) {
								m1 = m1 - 100;
								jLabel50.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv2.png")));
								f3lv = 1;
							} else {
								return;
							}

						} else if (f3lv == 1) {
							int res = JOptionPane
									.showConfirmDialog(null, "是否升级房子", "升级房子",
											JOptionPane.YES_NO_OPTION);
							if (res == JOptionPane.YES_OPTION) {
								m1 = m1 - 100;
								jLabel50.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv3.png")));
								f3lv = 2;
							} else {
								return;
							}

						}

					} else if (f3 == 2) {
						if (f3lv == 0) {
							m1 = m1 - 100;
							m2 = m2 + 100;
						} else if (f3lv == 1) {
							m1 = m1 - 200;
							m2 = m2 + 200;
						} else if (f3lv == 2) {
							m1 = m1 - 300;
							m2 = m2 + 300;
						}

					} else if (f3 == 3) {
						if (f3lv == 0) {
							m1 = m1 - 100;
							m3 = m3 + 100;
						} else if (f3lv == 1) {
							m1 = m1 - 200;
							m3 = m3 + 200;
						} else if (f3lv == 2) {
							m1 = m1 - 300;
							m3 = m3 + 300;
						}

					}
				}
				/*
				 * 4
				 */
				if (x1 == 634 && y1 == 190) {
					if (f4 == 0) {
						int res = JOptionPane.showConfirmDialog(null, "是否购买房子",
								"购买房子", JOptionPane.YES_NO_OPTION);
						if (res == JOptionPane.YES_OPTION) {
							m1 = m1 - 300;
							jLabel51.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel9.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/格子1.png")));
							f4 = 1;
						} else {
							f4 = 0;
							return;
						}

					} else if (f4 == 1) {
						if (f4lv == 0) {
							int res = JOptionPane
									.showConfirmDialog(null, "是否升级房子", "升级房子",
											JOptionPane.YES_NO_OPTION);
							if (res == JOptionPane.YES_OPTION) {
								m1 = m1 - 100;
								jLabel51.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv2.png")));
								f4lv = 1;
							} else {
								return;
							}

						} else if (f4lv == 1) {
							int res = JOptionPane
									.showConfirmDialog(null, "是否升级房子", "升级房子",
											JOptionPane.YES_NO_OPTION);
							if (res == JOptionPane.YES_OPTION) {
								m1 = m1 - 100;
								jLabel51.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv3.png")));
								f4lv = 2;
							} else {
								return;
							}

						}

					} else if (f4 == 2) {
						if (f4lv == 0) {
							m1 = m1 - 100;
							m2 = m2 + 100;
						} else if (f4lv == 1) {
							m1 = m1 - 200;
							m2 = m2 + 200;
						} else if (f4lv == 2) {
							m1 = m1 - 300;
							m2 = m2 + 300;
						}

					} else if (f4 == 3) {
						if (f4lv == 0) {
							m1 = m1 - 100;
							m3 = m3 + 100;
						} else if (f4lv == 1) {
							m1 = m1 - 200;
							m3 = m3 + 200;
						} else if (f4lv == 2) {
							m1 = m1 - 300;
							m3 = m3 + 300;
						}

					}
				}
				/*
				 * 5
				 */
				if (x1 == 634 && y1 == 330) {
					if (f5 == 0) {
						int res = JOptionPane.showConfirmDialog(null, "是否购买房子",
								"购买房子", JOptionPane.YES_NO_OPTION);
						if (res == JOptionPane.YES_OPTION) {
							m1 = m1 - 300;
							jLabel52.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel11.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/格子1.png")));
							f5 = 1;
						} else {
							f5 = 0;
							return;
						}

					} else if (f5 == 1) {
						if (f5lv == 0) {
							int res = JOptionPane
									.showConfirmDialog(null, "是否升级房子", "升级房子",
											JOptionPane.YES_NO_OPTION);
							if (res == JOptionPane.YES_OPTION) {
								m1 = m1 - 100;
								jLabel52.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv2.png")));
								f5lv = 1;
							} else {
								return;
							}

						} else if (f5lv == 1) {
							int res = JOptionPane
									.showConfirmDialog(null, "是否升级房子", "升级房子",
											JOptionPane.YES_NO_OPTION);
							if (res == JOptionPane.YES_OPTION) {
								m1 = m1 - 100;
								jLabel52.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv3.png")));
								f5lv = 2;
							} else {
								return;
							}

						}

					} else if (f5 == 2) {
						if (f5lv == 0) {
							m1 = m1 - 100;
							m2 = m2 + 100;
						} else if (f5lv == 1) {
							m1 = m1 - 200;
							m2 = m2 + 200;
						} else if (f5lv == 2) {
							m1 = m1 - 300;
							m2 = m2 + 300;
						}

					} else if (f5 == 3) {
						if (f5lv == 0) {
							m1 = m1 - 100;
							m3 = m3 + 100;
						} else if (f5lv == 1) {
							m1 = m1 - 200;
							m3 = m3 + 200;
						} else if (f5lv == 2) {
							m1 = m1 - 300;
							m3 = m3 + 300;
						}

					}
				}
				/*
				 * 6
				 */
				if (x1 == 634 && y1 == 400) {
					if (f6 == 0) {
						int res = JOptionPane.showConfirmDialog(null, "是否购买房子",
								"购买房子", JOptionPane.YES_NO_OPTION);
						if (res == JOptionPane.YES_OPTION) {
							m1 = m1 - 300;
							jLabel53.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel12.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/格子1.png")));
							f6 = 1;
						} else {
							f6 = 0;
							return;
						}

					} else if (f6 == 1) {
						if (f6lv == 0) {
							int res = JOptionPane
									.showConfirmDialog(null, "是否升级房子", "升级房子",
											JOptionPane.YES_NO_OPTION);
							if (res == JOptionPane.YES_OPTION) {
								m1 = m1 - 100;
								jLabel53.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv2.png")));
								f6lv = 1;
							} else {
								return;
							}

						} else if (f6lv == 1) {
							int res = JOptionPane
									.showConfirmDialog(null, "是否升级房子", "升级房子",
											JOptionPane.YES_NO_OPTION);
							if (res == JOptionPane.YES_OPTION) {
								m1 = m1 - 100;
								jLabel53.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv3.png")));
								f6lv = 2;
							} else {
								return;
							}

						}

					} else if (f6 == 2) {
						if (f6lv == 0) {
							m1 = m1 - 100;
							m2 = m2 + 100;
						} else if (f6lv == 1) {
							m1 = m1 - 200;
							m2 = m2 + 200;
						} else if (f6lv == 2) {
							m1 = m1 - 300;
							m2 = m2 + 300;
						}

					} else if (f6 == 3) {
						if (f6lv == 0) {
							m1 = m1 - 100;
							m3 = m3 + 100;
						} else if (f6lv == 1) {
							m1 = m1 - 200;
							m3 = m3 + 200;
						} else if (f6lv == 2) {
							m1 = m1 - 300;
							m3 = m3 + 300;
						}

					}
				}
				/*
				 * 7
				 */
				if (x1 == 546 && y1 == 540) {
					if (f7 == 0) {
						int res = JOptionPane.showConfirmDialog(null, "是否购买房子",
								"购买房子", JOptionPane.YES_NO_OPTION);
						if (res == JOptionPane.YES_OPTION) {
							m1 = m1 - 300;
							jLabel54.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel15.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/格子1.png")));
							f7 = 1;
						} else {
							f7 = 0;
							return;
						}

					} else if (f7 == 1) {
						if (f7lv == 0) {
							int res = JOptionPane
									.showConfirmDialog(null, "是否升级房子", "升级房子",
											JOptionPane.YES_NO_OPTION);
							if (res == JOptionPane.YES_OPTION) {
								m1 = m1 - 100;
								jLabel54.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv2.png")));
								f7lv = 1;
							} else {
								return;
							}

						} else if (f7lv == 1) {
							int res = JOptionPane
									.showConfirmDialog(null, "是否升级房子", "升级房子",
											JOptionPane.YES_NO_OPTION);
							if (res == JOptionPane.YES_OPTION) {
								m1 = m1 - 100;
								jLabel54.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv3.png")));
								f7lv = 2;
							} else {
								return;
							}

						}

					} else if (f7 == 2) {
						if (f7lv == 0) {
							m1 = m1 - 100;
							m2 = m2 + 100;
						} else if (f7lv == 1) {
							m1 = m1 - 200;
							m2 = m2 + 200;
						} else if (f7lv == 2) {
							m1 = m1 - 300;
							m2 = m2 + 300;
						}

					} else if (f7 == 3) {
						if (f7lv == 0) {
							m1 = m1 - 100;
							m3 = m3 + 100;
						} else if (f7lv == 1) {
							m1 = m1 - 200;
							m3 = m3 + 200;
						} else if (f7lv == 2) {
							m1 = m1 - 300;
							m3 = m3 + 300;
						}

					}
				}
				/*
				 * 8
				 */
				if (x1 == 458 && y1 == 540) {
					if (f8 == 0) {
						int res = JOptionPane.showConfirmDialog(null, "是否购买房子",
								"购买房子", JOptionPane.YES_NO_OPTION);
						if (res == JOptionPane.YES_OPTION) {
							m1 = m1 - 300;
							jLabel55.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel16.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/格子1.png")));
							f8 = 1;
						} else {
							f8 = 0;
							return;
						}

					} else if (f8 == 1) {
						if (f8lv == 0) {
							int res = JOptionPane
									.showConfirmDialog(null, "是否升级房子", "升级房子",
											JOptionPane.YES_NO_OPTION);
							if (res == JOptionPane.YES_OPTION) {
								m1 = m1 - 100;
								jLabel55.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv2.png")));
								f8lv = 1;
							} else {
								return;
							}

						} else if (f8lv == 1) {
							int res = JOptionPane
									.showConfirmDialog(null, "是否升级房子", "升级房子",
											JOptionPane.YES_NO_OPTION);
							if (res == JOptionPane.YES_OPTION) {
								m1 = m1 - 100;
								jLabel55.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv3.png")));
								f8lv = 2;
							} else {
								return;
							}

						}

					} else if (f8 == 2) {
						if (f8lv == 0) {
							m1 = m1 - 100;
							m2 = m2 + 100;
						} else if (f8lv == 1) {
							m1 = m1 - 200;
							m2 = m2 + 200;
						} else if (f8lv == 2) {
							m1 = m1 - 300;
							m2 = m2 + 300;
						}

					} else if (f8 == 3) {
						if (f8lv == 0) {
							m1 = m1 - 100;
							m3 = m3 + 100;
						} else if (f8lv == 1) {
							m1 = m1 - 200;
							m3 = m3 + 200;
						} else if (f8lv == 2) {
							m1 = m1 - 300;
							m3 = m3 + 300;
						}

					}
				}
				/*
				 * 9
				 */
				if (x1 == 370 && y1 == 540) {
					if (f9 == 0) {
						int res = JOptionPane.showConfirmDialog(null, "是否购买房子",
								"购买房子", JOptionPane.YES_NO_OPTION);
						if (res == JOptionPane.YES_OPTION) {
							m1 = m1 - 300;
							jLabel56.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel17.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/格子1.png")));
							f9 = 1;
						} else {
							f9 = 0;
							return;
						}

					} else if (f9 == 1) {
						if (f9lv == 0) {
							int res = JOptionPane
									.showConfirmDialog(null, "是否升级房子", "升级房子",
											JOptionPane.YES_NO_OPTION);
							if (res == JOptionPane.YES_OPTION) {
								m1 = m1 - 100;
								jLabel56.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv2.png")));
								f9lv = 1;
							} else {
								return;
							}

						} else if (f9lv == 1) {
							int res = JOptionPane
									.showConfirmDialog(null, "是否升级房子", "升级房子",
											JOptionPane.YES_NO_OPTION);
							if (res == JOptionPane.YES_OPTION) {
								m1 = m1 - 100;
								jLabel56.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv3.png")));
								f9lv = 2;
							} else {
								return;
							}

						}

					} else if (f9 == 2) {
						if (f9lv == 0) {
							m1 = m1 - 100;
							m2 = m2 + 100;
						} else if (f9lv == 1) {
							m1 = m1 - 200;
							m2 = m2 + 200;
						} else if (f9lv == 2) {
							m1 = m1 - 300;
							m2 = m2 + 300;
						}

					} else if (f9 == 3) {
						if (f9lv == 0) {
							m1 = m1 - 100;
							m3 = m3 + 100;
						} else if (f9lv == 1) {
							m1 = m1 - 200;
							m3 = m3 + 200;
						} else if (f9lv == 2) {
							m1 = m1 - 300;
							m3 = m3 + 300;
						}

					}
				}
				/*
				 * 10
				 */
				if (x1 == 194 && y1 == 540) {
					if (f10 == 0) {
						int res = JOptionPane.showConfirmDialog(null, "是否购买房子",
								"购买房子", JOptionPane.YES_NO_OPTION);
						if (res == JOptionPane.YES_OPTION) {
							m1 = m1 - 300;
							jLabel57.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel19.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/格子1.png")));
							f10 = 1;
						} else {
							f10 = 0;
							return;
						}

					} else if (f10 == 1) {
						if (f10lv == 0) {
							int res = JOptionPane
									.showConfirmDialog(null, "是否升级房子", "升级房子",
											JOptionPane.YES_NO_OPTION);
							if (res == JOptionPane.YES_OPTION) {
								m1 = m1 - 100;
								jLabel57.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv2.png")));
								f10lv = 1;
							} else {
								return;
							}

						} else if (f10lv == 1) {
							int res = JOptionPane
									.showConfirmDialog(null, "是否升级房子", "升级房子",
											JOptionPane.YES_NO_OPTION);
							if (res == JOptionPane.YES_OPTION) {
								m1 = m1 - 100;
								jLabel57.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv3.png")));
								f10lv = 2;
							} else {
								return;
							}

						}
					} else if (f10 == 2) {
						if (f10lv == 0) {
							m1 = m1 - 100;
							m2 = m2 + 100;
						} else if (f10lv == 1) {
							m1 = m1 - 200;
							m2 = m2 + 200;
						} else if (f10lv == 2) {
							m1 = m1 - 300;
							m2 = m2 + 300;
						}

					} else if (f10 == 3) {
						if (f10lv == 0) {
							m1 = m1 - 100;
							m3 = m3 + 100;
						} else if (f10lv == 1) {
							m1 = m1 - 200;
							m3 = m3 + 200;
						} else if (f10lv == 2) {
							m1 = m1 - 300;
							m3 = m3 + 300;
						}

					}
				}
				/*
				 * 11
				 */
				if (x1 == 106 && y1 == 470) {
					if (f11 == 0) {
						int res = JOptionPane.showConfirmDialog(null, "是否购买房子",
								"购买房子", JOptionPane.YES_NO_OPTION);
						if (res == JOptionPane.YES_OPTION) {
							m1 = m1 - 300;
							jLabel58.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel21.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/格子1.png")));
							f11 = 1;
						} else {
							f11 = 0;
							return;
						}

					} else if (f11 == 1) {
						if (f11lv == 0) {
							int res = JOptionPane
									.showConfirmDialog(null, "是否升级房子", "升级房子",
											JOptionPane.YES_NO_OPTION);
							if (res == JOptionPane.YES_OPTION) {
								m1 = m1 - 100;
								jLabel58.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv2.png")));
								f11lv = 1;
							} else {
								return;
							}

						} else if (f11lv == 1) {
							int res = JOptionPane
									.showConfirmDialog(null, "是否升级房子", "升级房子",
											JOptionPane.YES_NO_OPTION);
							if (res == JOptionPane.YES_OPTION) {
								m1 = m1 - 100;
								jLabel58.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv3.png")));
								f11lv = 2;
							} else {
								return;
							}

						}

					} else if (f11 == 2) {
						if (f11lv == 0) {
							m1 = m1 - 100;
							m2 = m2 + 100;
						} else if (f11lv == 1) {
							m1 = m1 - 200;
							m2 = m2 + 200;
						} else if (f11lv == 2) {
							m1 = m1 - 300;
							m2 = m2 + 300;
						}

					} else if (f11 == 3) {
						if (f11lv == 0) {
							m1 = m1 - 100;
							m3 = m3 + 100;
						} else if (f11lv == 1) {
							m1 = m1 - 200;
							m3 = m3 + 200;
						} else if (f11lv == 2) {
							m1 = m1 - 300;
							m3 = m3 + 300;
						}

					}
				}/*
					 * 12
					 */
				if (x1 == 106 && y1 == 330) {
					if (f12 == 0) {
						int res = JOptionPane.showConfirmDialog(null, "是否购买房子",
								"购买房子", JOptionPane.YES_NO_OPTION);
						if (res == JOptionPane.YES_OPTION) {
							m1 = m1 - 300;
							jLabel59.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel23.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/格子1.png")));
							f12 = 1;
						} else {
							f12 = 0;
							return;
						}

					} else if (f12 == 1) {
						if (f12lv == 0) {
							int res = JOptionPane
									.showConfirmDialog(null, "是否升级房子", "升级房子",
											JOptionPane.YES_NO_OPTION);
							if (res == JOptionPane.YES_OPTION) {
								m1 = m1 - 100;
								jLabel59.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv2.png")));
								f12lv = 1;
							} else {
								return;
							}

						} else if (f12lv == 1) {
							int res = JOptionPane
									.showConfirmDialog(null, "是否升级房子", "升级房子",
											JOptionPane.YES_NO_OPTION);
							if (res == JOptionPane.YES_OPTION) {
								m1 = m1 - 100;
								jLabel59.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv3.png")));
								f12lv = 2;
							} else {
								return;
							}

						}

					} else if (f12 == 2) {
						if (f12lv == 0) {
							m1 = m1 - 100;
							m2 = m2 + 100;
						} else if (f12lv == 1) {
							m1 = m1 - 200;
							m2 = m2 + 200;
						} else if (f12lv == 2) {
							m1 = m1 - 300;
							m2 = m2 + 300;
						}

					} else if (f12 == 3) {
						if (f12lv == 0) {
							m1 = m1 - 100;
							m3 = m3 + 100;
						} else if (f12lv == 1) {
							m1 = m1 - 200;
							m3 = m3 + 200;
						} else if (f12lv == 2) {
							m1 = m1 - 300;
							m3 = m3 + 300;
						}

					}
				}/*
					 * 13
					 */
				if (x1 == 106 && y1 == 260) {
					if (f13 == 0) {
						int res = JOptionPane.showConfirmDialog(null, "是否购买房子",
								"购买房子", JOptionPane.YES_NO_OPTION);
						if (res == JOptionPane.YES_OPTION) {
							m1 = m1 - 300;
							jLabel60.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel24.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/格子1.png")));
							f13 = 1;
						} else {
							f13 = 0;
							return;
						}

					} else if (f13 == 1) {
						if (f13lv == 0) {
							int res = JOptionPane
									.showConfirmDialog(null, "是否升级房子", "升级房子",
											JOptionPane.YES_NO_OPTION);
							if (res == JOptionPane.YES_OPTION) {
								m1 = m1 - 100;
								jLabel60.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv2.png")));
								f13lv = 1;
							} else {
								return;
							}

						} else if (f13lv == 1) {
							int res = JOptionPane
									.showConfirmDialog(null, "是否升级房子", "升级房子",
											JOptionPane.YES_NO_OPTION);
							if (res == JOptionPane.YES_OPTION) {
								m1 = m1 - 100;
								jLabel60.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv3.png")));
								f13lv = 2;
							} else {
								return;
							}

						}

					} else if (f13 == 2) {
						if (f13lv == 0) {
							m1 = m1 - 100;
							m2 = m2 + 100;
						} else if (f13lv == 1) {
							m1 = m1 - 200;
							m2 = m2 + 200;
						} else if (f13lv == 2) {
							m1 = m1 - 300;
							m2 = m2 + 300;
						}

					} else if (f13 == 3) {
						if (f13lv == 0) {
							m1 = m1 - 100;
							m3 = m3 + 100;
						} else if (f13lv == 1) {
							m1 = m1 - 200;
							m3 = m3 + 200;
						} else if (f13lv == 2) {
							m1 = m1 - 300;
							m3 = m3 + 300;
						}

					}
				}
				/*
				 * 随机事件格子
				 */
				if (x1 == 370 && y1 == 120) {
					Random r1 = new Random();
					int sj1 = r1.nextInt(2);
					if (sj1 == 0) {
						s1 = 1;
						JOptionPane.showMessageDialog(null, "摔伤了，下回合停止移动",
								"随机事件", JOptionPane.CANCEL_OPTION);
					} else if (sj1 == 1) {
						m1 = m1 + 300;
						JOptionPane.showMessageDialog(null, "在宫中逛宫，捡到300文钱",
								"随机事件", JOptionPane.CANCEL_OPTION);
					} else if (sj1 == 2) {
						m1 = m1 - 100;
						JOptionPane.showMessageDialog(null, "在宫中做错了事，被罚100文钱",
								"随机事件", JOptionPane.CANCEL_OPTION);
					}

				}
				/*
				 * 抽卡格子
				 */
				if (x1 == 634 && y1 == 120) {
					Random c = new Random();
					int card = c.nextInt(2);
					if (card1 == 0) {
						card1 = card + 1;
						if (card + 1 == 1) {

							JOptionPane.showMessageDialog(null, "获得贿赂卡", "抽卡",
									JOptionPane.CANCEL_OPTION);
						} else if (card + 1 == 2) {
							JOptionPane.showMessageDialog(null, "获得随机卡", "抽卡",
									JOptionPane.CANCEL_OPTION);
						} else if (card + 1 == 3) {
							JOptionPane.showMessageDialog(null, "获得赦免卡", "抽卡",
									JOptionPane.CANCEL_OPTION);
						}

					} else if (card2 == 0) {
						card2 = card + 1;
						if (card + 1 == 1) {

							JOptionPane.showMessageDialog(null, "获得贿赂卡", "抽卡",
									JOptionPane.CANCEL_OPTION);
						} else if (card + 1 == 2) {
							JOptionPane.showMessageDialog(null, "获得随机卡", "抽卡",
									JOptionPane.CANCEL_OPTION);
						} else if (card + 1 == 3) {
							JOptionPane.showMessageDialog(null, "获得赦免卡", "抽卡",
									JOptionPane.CANCEL_OPTION);
						}

					} else if (card3 == 0) {
						card3 = card + 1;
						if (card + 1 == 1) {

							JOptionPane.showMessageDialog(null, "获得贿赂卡", "抽卡",
									JOptionPane.CANCEL_OPTION);
						} else if (card + 1 == 2) {
							JOptionPane.showMessageDialog(null, "获得随机卡", "抽卡",
									JOptionPane.CANCEL_OPTION);
						} else if (card + 1 == 3) {
							JOptionPane.showMessageDialog(null, "获得赦免卡", "抽卡",
									JOptionPane.CANCEL_OPTION);
						}
					} else {
						JOptionPane.showMessageDialog(null, "最多只能拥有三张卡片", "抽卡",
								JOptionPane.CANCEL_OPTION);

					}

				}
				/*
				 * 加钱格子
				 */
				if (x1 == 634 && y1 == 540) {
					m1 = m1 + 300;
					JOptionPane.showMessageDialog(null, "在宫中逛宫，捡到300文钱",
							"随机事件", JOptionPane.CANCEL_OPTION);
				}
				/*
				 * 暂停格子
				 */
				if (x1 == 106 && y1 == 540) {
					s1 = 1;
					JOptionPane.showMessageDialog(null, "摔伤了，下回合停止移动", "随机事件",
							JOptionPane.CANCEL_OPTION);
				}
				/*
				 * 扣钱格子
				 */
				if (x1 == 106 && y1 == 400) {
					m1 = m1 - 100;
					JOptionPane.showMessageDialog(null, "在宫中做错了事，被罚100文钱",
							"随机事件", JOptionPane.CANCEL_OPTION);

				}
				order = 2;
			} else if (s1 == 1) {
				s1 = s1 - 1;
				JOptionPane.showMessageDialog(null, "停止一回合", "提示",
						JOptionPane.CANCEL_OPTION);
				order = 2;
			}
			jTextField1.setText(Integer.toString(m1));

		case 2:
			if (s2 == 0) {
				Play2 b = new Play2();
				Thread d = new Thread(b);
				d.start();

				order = 3;
			} else if (s2 == 1) {
				s2 = s2 - 1;
				order = 3;
			}

		case 3:
			if (s3 == 0) {
				Play3 c = new Play3();
				Thread d = new Thread(c);
				d.start();

				order = 1;
			} else if (s3 == 1) {
				s3 = s3 - 1;
				order = 1;
			}
		}

	}

	private void jButton104ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton103ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton66ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton62ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Map1SView().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel18;
	private javax.swing.JLabel jLabel19;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel20;
	private javax.swing.JLabel jLabel21;
	private javax.swing.JLabel jLabel22;
	private javax.swing.JLabel jLabel23;
	private javax.swing.JLabel jLabel24;
	private javax.swing.JLabel jLabel25;
	private javax.swing.JLabel jLabel26;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel48;
	private javax.swing.JLabel jLabel49;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel50;
	private javax.swing.JLabel jLabel51;
	private javax.swing.JLabel jLabel52;
	private javax.swing.JLabel jLabel53;
	private javax.swing.JLabel jLabel54;
	private javax.swing.JLabel jLabel55;
	private javax.swing.JLabel jLabel56;
	private javax.swing.JLabel jLabel57;
	private javax.swing.JLabel jLabel58;
	private javax.swing.JLabel jLabel59;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel60;
	private javax.swing.JLabel jLabel61;
	private javax.swing.JLabel jLabel62;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField5;
	// End of variables declaration//GEN-END:variables

}