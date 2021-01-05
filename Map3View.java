/*
 * zx.java
 *
 * Created on __DATE__, __TIME__
 */

package modelview;

import java.util.Random;

import javax.swing.JOptionPane;

import modelview.Map2SView.P2;

/**
 *
 * @author  __USER__
 */
public class Map3View extends javax.swing.JFrame {
	public static int order;
	public int x1 = 150;
	public int y1 = 170;
	public int x2 = 150;
	public int y2 = 170;
	public int x3 = 150;
	public int y3 = 170;
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
	public static int s1 = 0;
	public static int s2 = 0;
	public static int s3 = 0;
	public static int card1 = 0;
	public static int card2 = 0;
	public static int card3 = 0;
	public int s = 0;

	/** Creates new form zx */
	public Map3View() {
		initComponents();
		jButton1.setOpaque(false);
		jButton4.setOpaque(false);
		jButton5.setOpaque(false);

		this.setLocationRelativeTo(null);
		if (m1 <= 0) {
			new lose().setVisible(true);
			this.dispose();
		}
	}
/*
 * 多线程
 */
	class Pl2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(500);
			Random random2 = new Random();
			int index2 = random2.nextInt(5);
			int move2 = index2 + 1;
			for (int i = 0; i < move2; i++) {

				if (150 <= x2 && x2 < 550 && y2 == 170) {
					x2 = x2 + 80;
					jLabel25.setBounds(x2, y2, 50, 50);
					continue;
				}
				if (150 < x2 && x2 <= 550 && y2 == 490) {
					x2 = x2 - 80;
					jLabel25.setBounds(x2, y2, 50, 50);
					continue;
				}
				if (170 <= y2 && y2 < 490 && x2 == 550) {
					y2 = y2 + 80;
					jLabel25.setBounds(x2, y2, 50, 50);

					continue;
				}
				if (170 < y2 && y2 <= 490 && x2 == 150) {
					y2 = y2 - 80;
					jLabel25.setBounds(x2, y2, 50, 50);

					continue;
				}

			}
			/*
			 * 1
			 */
			if (x2 == 230 && y2 == 170) {
				if (f1 == 0) {
					if (m2 >= 300) {
						m2 = m2 - 300;
						jLabel50.setIcon(new javax.swing.ImageIcon(
								getClass().getResource("/images/Lv1.png")));
						jLabel3.setIcon(new javax.swing.ImageIcon(
								getClass().getResource("/img/图层8.2.png")));

						f1 = 2;
					}

				} else if (f1 == 2) {
					if (f1lv == 0) {
						if (m2 >= 100) {
							m2 = m2 - 100;
							jLabel50.setIcon(new javax.swing.ImageIcon(
									getClass().getResource(
											"/images/Lv2.png")));
							f1lv = 1;
						}

					} else if (f1lv == 1) {
						if (m2 >= 100) {
							m2 = m2 - 100;
							jLabel50.setIcon(new javax.swing.ImageIcon(
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
			if (x2 == 390 && y2 == 170) {
				if (f2 == 0) {
					if (m2 >= 300) {
						m2 = m2 - 300;
						jLabel51.setIcon(new javax.swing.ImageIcon(
								getClass().getResource("/images/Lv1.png")));
						jLabel5.setIcon(new javax.swing.ImageIcon(
								getClass().getResource("/img/图层8.2.png")));

						f2 = 2;
					}

				} else if (f2 == 2) {
					if (f2lv == 0) {
						if (m2 >= 100) {
							m2 = m2 - 100;
							jLabel51.setIcon(new javax.swing.ImageIcon(
									getClass().getResource(
											"/images/Lv2.png")));
							f2lv = 1;
						}

					} else if (f2lv == 1) {
						if (m2 >= 100) {
							m2 = m2 - 100;
							jLabel51.setIcon(new javax.swing.ImageIcon(
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
			if (x2 == 470 && y2 == 170) {
				if (f3 == 0) {
					if (m2 >= 300) {
						m2 = m2 - 300;
						jLabel52.setIcon(new javax.swing.ImageIcon(
								getClass().getResource("/images/Lv1.png")));
						jLabel6.setIcon(new javax.swing.ImageIcon(
								getClass().getResource("/img/图层8.2.png")));

						f3 = 2;
					}

				} else if (f3 == 2) {
					if (f3lv == 0) {
						if (m2 >= 100) {
							m2 = m2 - 100;
							jLabel52.setIcon(new javax.swing.ImageIcon(
									getClass().getResource(
											"/images/Lv2.png")));
							f3lv = 1;
						}

					} else if (f3lv == 1) {
						if (m2 >= 100) {
							m2 = m2 - 100;
							jLabel52.setIcon(new javax.swing.ImageIcon(
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
			if (x2 == 550 && y2 == 250) {
				if (f4 == 0) {
					if (m2 >= 300) {
						m2 = m2 - 300;
						jLabel53.setIcon(new javax.swing.ImageIcon(
								getClass().getResource("/images/Lv1.png")));
						jLabel8.setIcon(new javax.swing.ImageIcon(
								getClass().getResource("/img/图层8.2.png")));

						f4 = 2;
					}

				} else if (f4 == 2) {
					if (f4lv == 0) {
						if (m2 >= 100) {
							m2 = m2 - 100;
							jLabel53.setIcon(new javax.swing.ImageIcon(
									getClass().getResource(
											"/images/Lv2.png")));
							f4lv = 1;
						}

					} else if (f4lv == 1) {
						if (m2 >= 100) {
							m2 = m2 - 100;
							jLabel53.setIcon(new javax.swing.ImageIcon(
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
			if (x2 == 550 && y2 == 330) {
				if (f5 == 0) {
					if (m2 >= 300) {
						m2 = m2 - 300;
						jLabel54.setIcon(new javax.swing.ImageIcon(
								getClass().getResource("/images/Lv1.png")));
						jLabel9.setIcon(new javax.swing.ImageIcon(
								getClass().getResource("/img/图层8.2.png")));

						f5 = 2;
					}

				} else if (f5 == 2) {
					if (f5lv == 0) {
						if (m2 >= 100) {
							m2 = m2 - 100;
							jLabel54.setIcon(new javax.swing.ImageIcon(
									getClass().getResource(
											"/images/Lv2.png")));
							f5lv = 1;
						}

					} else if (f5lv == 1) {
						if (m2 >= 100) {
							m2 = m2 - 100;
							jLabel54.setIcon(new javax.swing.ImageIcon(
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
			if (x2 == 470 && y2 == 490) {
				if (f6 == 0) {
					if (m2 >= 300) {
						m2 = m2 - 300;
						jLabel55.setIcon(new javax.swing.ImageIcon(
								getClass().getResource("/images/Lv1.png")));
						jLabel12.setIcon(new javax.swing.ImageIcon(
								getClass().getResource("/img/图层8.2.png")));

						f6 = 2;
					}

				} else if (f6 == 2) {
					if (f6lv == 0) {
						if (m2 >= 100) {
							m2 = m2 - 100;
							jLabel55.setIcon(new javax.swing.ImageIcon(
									getClass().getResource(
											"/images/Lv2.png")));
							f6lv = 1;
						}

					} else if (f6lv == 1) {
						if (m2 >= 100) {
							m2 = m2 - 100;
							jLabel55.setIcon(new javax.swing.ImageIcon(
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
			if (x2 == 390 && y2 == 490) {
				if (f7 == 0) {
					if (m2 >= 300) {
						m2 = m2 - 300;
						jLabel56.setIcon(new javax.swing.ImageIcon(
								getClass().getResource("/images/Lv1.png")));
						jLabel13.setIcon(new javax.swing.ImageIcon(
								getClass().getResource("/img/图层8.2.png")));

						f7 = 2;
					}

				} else if (f7 == 2) {
					if (f7lv == 0) {
						if (m2 >= 100) {
							m2 = m2 - 100;
							jLabel56.setIcon(new javax.swing.ImageIcon(
									getClass().getResource(
											"/images/Lv2.png")));
							f7lv = 1;
						}

					} else if (f7lv == 1) {
						if (m2 >= 100) {
							m2 = m2 - 100;
							jLabel56.setIcon(new javax.swing.ImageIcon(
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
			if (x2 == 230 && y2 == 490) {
				if (f8 == 0) {
					if (m2 >= 300) {
						m2 = m2 - 300;
						jLabel57.setIcon(new javax.swing.ImageIcon(
								getClass().getResource("/images/Lv1.png")));
						jLabel15.setIcon(new javax.swing.ImageIcon(
								getClass().getResource("/img/图层8.2.png")));

						f8 = 2;
					}

				} else if (f8 == 2) {
					if (f8lv == 0) {
						if (m2 >= 100) {
							m2 = m2 - 100;
							jLabel57.setIcon(new javax.swing.ImageIcon(
									getClass().getResource(
											"/images/Lv2.png")));
							f8lv = 1;
						}

					} else if (f8lv == 1) {
						if (m2 >= 100) {
							m2 = m2 - 100;
							jLabel57.setIcon(new javax.swing.ImageIcon(
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
			if (x2 == 150 && y2 == 410) {
				if (f9 == 0) {
					if (m2 >= 300) {
						m2 = m2 - 300;
						jLabel58.setIcon(new javax.swing.ImageIcon(
								getClass().getResource("/images/Lv1.png")));
						jLabel17.setIcon(new javax.swing.ImageIcon(
								getClass().getResource("/img/图层8.2.png")));

						f9 = 2;
					}

				} else if (f9 == 2) {
					if (f9lv == 0) {
						if (m2 >= 100) {
							m2 = m2 - 100;
							jLabel58.setIcon(new javax.swing.ImageIcon(
									getClass().getResource(
											"/images/Lv2.png")));
							f9lv = 1;
						}

					} else if (f9lv == 1) {
						if (m2 >= 100) {
							m2 = m2 - 100;
							jLabel58.setIcon(new javax.swing.ImageIcon(
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
			if (x2 == 150 && y2 == 250) {
				if (f10 == 0) {
					if (m2 >= 300) {
						m2 = m2 - 300;
						jLabel59.setIcon(new javax.swing.ImageIcon(
								getClass().getResource("/images/Lv1.png")));
						jLabel19.setIcon(new javax.swing.ImageIcon(
								getClass().getResource("/img/图层8.2.png")));

						f10 = 2;
					}

				} else if (f10 == 2) {
					if (f10lv == 0) {
						if (m2 >= 100) {
							m2 = m2 - 100;
							jLabel59.setIcon(new javax.swing.ImageIcon(
									getClass().getResource(
											"/images/Lv2.png")));
							f10lv = 1;
						}

					} else if (f10lv == 1) {
						if (m2 >= 100) {
							m2 = m2 - 100;
							jLabel59.setIcon(new javax.swing.ImageIcon(
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
			 * 随机事件格子
			 */
			if (x2 == 550 && y2 == 170) {
				Random r1 = new Random();
				int sj1 = r1.nextInt(2);
				if (sj1 == 0) {
					s2 = 1;

				} else if (sj1 == 1) {
					m2 = m2 + 300;

				} else if (sj1 == 2) {
					m2 = m2 - 100;

				}

			}
			if (x2 == 150 && y2 == 330) {
				Random r1 = new Random();
				int sj1 = r1.nextInt(2);
				if (sj1 == 0) {
					s2 = 1;

				} else if (sj1 == 1) {
					m2 = m2 + 300;

				} else if (sj1 == 2) {
					m2 = m2 - 100;

				}

			}
			if (x2 == 550 && y2 == 490) {
				Random r1 = new Random();
				int sj1 = r1.nextInt(2);
				if (sj1 == 0) {
					s2 = 1;

				} else if (sj1 == 1) {
					m2 = m2 + 300;

				} else if (sj1 == 2) {
					m2 = m2 - 100;

				}

			}

			/*
			 * 加钱格子
			 */
			if (x2 == 150 && y2 == 330) {
				m2 = m2 + 300;

			}
			/*
			 * 暂停格子
			 */
			if (x2 == 310 && y2 == 490) {
				s2 = 1;

			}
			/*
			 * 扣钱格子
			 */
			if (x2 == 310 && y2 == 170) {
				m2 = m2 - 100;

			}
			jTextField1.setText(Integer.toString(m1));
			jTextField2.setText(Integer.toString(m2));
			jTextField3.setText(Integer.toString(m3));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	}
	
	
	class Pl3 implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				Thread.sleep(1000);
				Random random3 = new Random();
				int index3 = random3.nextInt(5);
				int move3 = index3 + 1;
				for (int i = 0; i < move3; i++) {

					if (150 <= x3 && x3 < 550 && y3 == 170) {
						x3 = x3 + 80;
						jLabel26.setBounds(x3, y3, 50, 50);
						continue;
					}
					if (150 < x3 && x3 <= 550 && y3 == 490) {
						x3 = x3 - 80;
						jLabel26.setBounds(x3, y3, 50, 50);
						continue;
					}
					if (170 <= y3 && y3 < 490 && x3 == 550) {
						y3 = y3 + 80;
						jLabel26.setBounds(x3, y3, 50, 50);

						continue;
					}
					if (170 < y3 && y3 <= 490 && x3 == 150) {
						y3 = y3 - 80;
						jLabel26.setBounds(x3, y3, 50, 50);

						continue;
					}

				}
				/*
				 * 1
				 */
				if (x3 == 230 && y3 == 170) {
					if (f1 == 0) {
						if (m3 >= 300) {
							m3 = m3 - 300;
							jLabel50.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel3.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/img/图层8.3.png")));

							f1 = 3;
						}

					} else if (f1 == 3) {
						if (f1lv == 0) {
							if (m3 >= 100) {
								m3 = m3 - 100;
								jLabel50.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv2.png")));
								f1lv = 1;
							}

						} else if (f1lv == 1) {
							if (m3 >= 100) {
								m3 = m3 - 100;
								jLabel50.setIcon(new javax.swing.ImageIcon(
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
				if (x3 == 390 && y3 == 170) {
					if (f2 == 0) {
						if (m3 >= 300) {
							m3 = m3 - 300;
							jLabel51.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel5.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/img/图层8.3.png")));

							f2 = 3;
						}

					} else if (f2 == 3) {
						if (f2lv == 0) {
							if (m3 >= 100) {
								m3 = m3 - 100;
								jLabel51.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv2.png")));
								f2lv = 1;
							}

						} else if (f2lv == 1) {
							if (m3 >= 100) {
								m3 = m3 - 100;
								jLabel51.setIcon(new javax.swing.ImageIcon(
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
				if (x3 == 470 && y3 == 170) {
					if (f3 == 0) {
						if (m3 >= 300) {
							m3 = m3 - 300;
							jLabel52.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel6.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/img/图层8.3.png")));

							f3 = 3;
						}

					} else if (f3 == 3) {
						if (f3lv == 0) {
							if (m3 >= 100) {
								m3 = m3 - 100;
								jLabel52.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv2.png")));
								f3lv = 1;
							}

						} else if (f3lv == 1) {
							if (m3 >= 100) {
								m3 = m3 - 100;
								jLabel52.setIcon(new javax.swing.ImageIcon(
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
				if (x3 == 550 && y3 == 250) {
					if (f4 == 0) {
						if (m3 >= 300) {
							m3 = m3 - 300;
							jLabel53.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel8.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/img/图层8.3.png")));

							f4 = 3;
						}

					} else if (f4 == 3) {
						if (f4lv == 0) {
							if (m3 >= 100) {
								m3 = m3 - 100;
								jLabel53.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv2.png")));
								f4lv = 1;
							}

						} else if (f4lv == 1) {
							if (m3 >= 100) {
								m3 = m3 - 100;
								jLabel53.setIcon(new javax.swing.ImageIcon(
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
				if (x3 == 550 && y3 == 330) {
					if (f3 == 0) {
						if (m3 >= 300) {
							m3 = m3 - 300;
							jLabel54.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel9.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/img/图层8.3.png")));

							f5 = 3;
						}

					} else if (f5 == 3) {
						if (f5lv == 0) {
							if (m3 >= 100) {
								m3 = m3 - 100;
								jLabel54.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv2.png")));
								f5lv = 1;
							}

						} else if (f5lv == 1) {
							if (m3 >= 100) {
								m3 = m3 - 100;
								jLabel54.setIcon(new javax.swing.ImageIcon(
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
				if (x3 == 470 && y3 == 490) {
					if (f6 == 0) {
						if (m3 >= 300) {
							m3 = m3 - 300;
							jLabel55.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel12.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/img/图层8.3.png")));

							f6 = 3;
						}

					} else if (f6 == 3) {
						if (f6lv == 0) {
							if (m3 >= 100) {
								m3 = m3 - 100;
								jLabel55.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv2.png")));
								f6lv = 1;
							}

						} else if (f6lv == 1) {
							if (m3 >= 100) {
								m3 = m3 - 100;
								jLabel55.setIcon(new javax.swing.ImageIcon(
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
				if (x3 == 390 && y3 == 490) {
					if (f7 == 0) {
						if (m3 >= 300) {
							m3 = m3 - 300;
							jLabel56.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel13.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/img/图层8.3.png")));

							f7 = 3;
						}

					} else if (f7 == 3) {
						if (f7lv == 0) {
							if (m3 >= 100) {
								m3 = m3 - 100;
								jLabel56.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv2.png")));
								f7lv = 1;
							}

						} else if (f7lv == 1) {
							if (m3 >= 100) {
								m3 = m3 - 100;
								jLabel56.setIcon(new javax.swing.ImageIcon(
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
				if (x3 == 230 && y3 == 490) {
					if (f8 == 0) {
						if (m3 >= 300) {
							m3 = m3 - 300;
							jLabel57.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel15.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/img/图层8.3.png")));

							f8 = 3;
						}

					} else if (f8 == 3) {
						if (f8lv == 0) {
							if (m3 >= 100) {
								m3 = m3 - 100;
								jLabel57.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv2.png")));
								f8lv = 1;
							}

						} else if (f8lv == 1) {
							if (m3 >= 100) {
								m3 = m3 - 100;
								jLabel57.setIcon(new javax.swing.ImageIcon(
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
				if (x3 == 150 && y3 == 410) {
					if (f9 == 0) {
						if (m3 >= 300) {
							m3 = m3 - 300;
							jLabel58.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel17.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/img/图层8.3.png")));

							f9 = 3;
						}

					} else if (f9 == 3) {
						if (f9lv == 0) {
							if (m3 >= 100) {
								m3 = m3 - 100;
								jLabel58.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv2.png")));
								f9lv = 1;
							}

						} else if (f9lv == 1) {
							if (m3 >= 100) {
								m3 = m3 - 100;
								jLabel58.setIcon(new javax.swing.ImageIcon(
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
				if (x3 == 150 && y3 == 250) {
					if (f10 == 0) {
						if (m3 >= 300) {
							m3 = m3 - 300;
							jLabel59.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel19.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/img/图层8.3.png")));

							f10 = 3;
						}

					} else if (f10 == 3) {
						if (f10lv == 0) {
							if (m3 >= 100) {
								m3 = m3 - 100;
								jLabel59.setIcon(new javax.swing.ImageIcon(
										getClass().getResource(
												"/images/Lv2.png")));
								f10lv = 1;
							}

						} else if (f10lv == 1) {
							if (m3 >= 100) {
								m3 = m3 - 100;
								jLabel59.setIcon(new javax.swing.ImageIcon(
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
				 * 随机事件格子
				 */
				if (x3 == 550 && y3 == 170) {
					Random r1 = new Random();
					int sj1 = r1.nextInt(2);
					if (sj1 == 0) {
						s3 = 1;

					} else if (sj1 == 1) {
						m3 = m3 + 300;

					} else if (sj1 == 2) {
						m3 = m3 - 100;

					}

				}
				if (x3 == 150 && y3 == 330) {
					Random r1 = new Random();
					int sj1 = r1.nextInt(2);
					if (sj1 == 0) {
						s3 = 1;

					} else if (sj1 == 1) {
						m3 = m3 + 300;

					} else if (sj1 == 2) {
						m3 = m3 - 100;

					}

				}
				if (x3 == 550 && y3 == 490) {
					Random r1 = new Random();
					int sj1 = r1.nextInt(2);
					if (sj1 == 0) {
						s3 = 1;

					} else if (sj1 == 1) {
						m3 = m3 + 300;

					} else if (sj1 == 2) {
						m3 = m3 - 100;

					}

				}

				/*
				 * 加钱格子
				 */
				if (x3 == 150 && y3 == 490) {
					m3 = m3 + 300;

				}
				/*
				 * 暂停格子
				 */
				if (x3 == 310 && y3 == 490) {
					s3 = 1;

				}
				/*
				 * 扣钱格子
				 */
				if (x3 == 310 && y3 == 170) {
					m3 = m3 - 100;

				}
				jTextField1.setText(Integer.toString(m1));
				jTextField2.setText(Integer.toString(m2));
				jTextField3.setText(Integer.toString(m3));
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
		jLabel24 = new javax.swing.JLabel();
		jLabel25 = new javax.swing.JLabel();
		jLabel26 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
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
		jButton5 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jTextField1 = new javax.swing.JTextField();
		jTextField2 = new javax.swing.JTextField();
		jTextField3 = new javax.swing.JTextField();
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
		jLabel1 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setUndecorated(true);

		jPanel1.setLayout(null);

		jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/太监.png"))); // NOI18N
		jPanel1.add(jLabel24);
		jLabel24.setBounds(90, 160, 40, 60);

		jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/妃子.png"))); // NOI18N
		jPanel1.add(jLabel25);
		jLabel25.setBounds(120, 160, 30, 60);

		jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/宫女.png"))); // NOI18N
		jPanel1.add(jLabel26);
		jLabel26.setBounds(160, 110, 40, 60);

		jButton1.setBackground(new java.awt.Color(255, 255, 255));
		jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/返回按钮.png"))); // NOI18N
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton1);
		jButton1.setBounds(760, 0, 40, 50);

		jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/地图3棋子.png"))); // NOI18N
		jPanel1.add(jLabel2);
		jLabel2.setBounds(150, 170, 55, 60);

		jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/地图3棋子.png"))); // NOI18N
		jPanel1.add(jLabel3);
		jLabel3.setBounds(230, 170, 55, 60);

		jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/地图3棋子.png"))); // NOI18N
		jPanel1.add(jLabel4);
		jLabel4.setBounds(310, 170, 55, 60);

		jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/地图3棋子.png"))); // NOI18N
		jPanel1.add(jLabel5);
		jLabel5.setBounds(390, 170, 55, 60);

		jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/地图3棋子.png"))); // NOI18N
		jPanel1.add(jLabel6);
		jLabel6.setBounds(470, 170, 55, 60);

		jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/地图3棋子.png"))); // NOI18N
		jPanel1.add(jLabel7);
		jLabel7.setBounds(550, 170, 55, 60);

		jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/地图3棋子.png"))); // NOI18N
		jPanel1.add(jLabel8);
		jLabel8.setBounds(550, 250, 55, 60);

		jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/地图3棋子.png"))); // NOI18N
		jPanel1.add(jLabel9);
		jLabel9.setBounds(550, 330, 55, 60);

		jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/地图3棋子.png"))); // NOI18N
		jPanel1.add(jLabel10);
		jLabel10.setBounds(550, 410, 55, 60);

		jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/地图3棋子.png"))); // NOI18N
		jPanel1.add(jLabel11);
		jLabel11.setBounds(550, 490, 55, 60);

		jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/地图3棋子.png"))); // NOI18N
		jPanel1.add(jLabel12);
		jLabel12.setBounds(470, 490, 55, 60);

		jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/地图3棋子.png"))); // NOI18N
		jPanel1.add(jLabel13);
		jLabel13.setBounds(390, 490, 55, 60);

		jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/地图3棋子.png"))); // NOI18N
		jPanel1.add(jLabel14);
		jLabel14.setBounds(310, 490, 55, 60);

		jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/地图3棋子.png"))); // NOI18N
		jPanel1.add(jLabel15);
		jLabel15.setBounds(230, 490, 55, 60);

		jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/地图3棋子.png"))); // NOI18N
		jPanel1.add(jLabel16);
		jLabel16.setBounds(150, 490, 55, 60);

		jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/地图3棋子.png"))); // NOI18N
		jPanel1.add(jLabel17);
		jLabel17.setBounds(150, 410, 55, 60);

		jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/地图3棋子.png"))); // NOI18N
		jPanel1.add(jLabel18);
		jLabel18.setBounds(150, 330, 55, 60);

		jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/地图3棋子.png"))); // NOI18N
		jPanel1.add(jLabel19);
		jLabel19.setBounds(150, 250, 55, 60);

		jButton5.setBackground(new java.awt.Color(255, 255, 255));
		jButton5.setForeground(new java.awt.Color(255, 255, 255));
		jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/卡片按钮.png"))); // NOI18N
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton5);
		jButton5.setBounds(710, 670, 70, 40);

		jButton4.setBackground(new java.awt.Color(255, 255, 255));
		jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/色子按钮.png"))); // NOI18N
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});
		jPanel1.add(jButton4);
		jButton4.setBounds(330, 410, 70, 70);

		jTextField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField1ActionPerformed(evt);
			}
		});
		jPanel1.add(jTextField1);
		jTextField1.setBounds(90, 30, 60, 20);

		jTextField2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField2ActionPerformed(evt);
			}
		});
		jPanel1.add(jTextField2);
		jTextField2.setBounds(280, 30, 70, 20);

		jTextField3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField3ActionPerformed(evt);
			}
		});
		jPanel1.add(jTextField3);
		jTextField3.setBounds(470, 30, 60, 20);
		jPanel1.add(jLabel50);
		jLabel50.setBounds(240, 120, 50, 50);
		jPanel1.add(jLabel51);
		jLabel51.setBounds(390, 120, 50, 50);
		jPanel1.add(jLabel52);
		jLabel52.setBounds(470, 120, 50, 50);
		jPanel1.add(jLabel53);
		jLabel53.setBounds(610, 250, 50, 50);
		jPanel1.add(jLabel54);
		jLabel54.setBounds(610, 330, 50, 50);
		jPanel1.add(jLabel55);
		jLabel55.setBounds(480, 570, 50, 50);
		jPanel1.add(jLabel56);
		jLabel56.setBounds(400, 570, 50, 50);
		jPanel1.add(jLabel57);
		jLabel57.setBounds(230, 570, 50, 50);
		jPanel1.add(jLabel58);
		jLabel58.setBounds(100, 420, 50, 50);
		jPanel1.add(jLabel59);
		jLabel59.setBounds(100, 250, 50, 50);

		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img1/地图3.png"))); // NOI18N
		jPanel1.add(jLabel1);
		jLabel1.setBounds(0, 0, 800, 710);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 801,
				javax.swing.GroupLayout.PREFERRED_SIZE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 711,
				javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
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

					if (150 <= x1 && x1 < 550 && y1 == 170) {
						x1 = x1 + 80;
						jLabel24.setBounds(x1, y1, 50, 50);
						continue;
					}
					if (150 < x1 && x1 <= 550 && y1 == 490) {
						x1 = x1 - 80;
						jLabel24.setBounds(x1, y1, 50, 50);
						continue;
					}
					if (170 <= y1 && y1 < 490 && x1 == 550) {
						y1 = y1 + 80;
						jLabel24.setBounds(x1, y1, 50, 50);

						continue;
					}
					if (170 < y1 && y1 <= 490 && x1 == 150) {
						y1 = y1 - 80;
						jLabel24.setBounds(x1, y1, 50, 50);

						continue;
					}

				}
				/*
				 * 起点（事件触发地点）
				 */
				if (x1 == 150 && y1 == 170) {
					if (s == 1) {
						new jq5().setVisible(true);
						jTextField1.setText(Integer.toString(m1));
					}
					if (s == 2) {
						new jq6().setVisible(true);
						jTextField1.setText(Integer.toString(m1));
					}
					if (s == 3) {
						new jq7().setVisible(true);
						jTextField1.setText(Integer.toString(m1));
					}
					if (s == 4) {
						new jq8().setVisible(true);
						jTextField1.setText(Integer.toString(m1));
					}
					if (s == 6) {
						if (m1 > m2 && m1 > m3) {
							new Map2S().setVisible(true);
						} else {
							new lose().setVisible(true);
						}
					}
					s = s + 1;
				}
				/*
				 * 房子1
				 */
				if (x1 == 230 && y1 == 170) {
					if (f1 == 0) {
						int res = JOptionPane.showConfirmDialog(null, "是否购买房子",
								"购买房子", JOptionPane.YES_NO_OPTION);
						if (res == JOptionPane.YES_OPTION) {
							m1 = m1 - 300;
							jLabel50.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel3.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/img/图层8.1.png")));
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
								jLabel50.setIcon(new javax.swing.ImageIcon(
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
								jLabel50.setIcon(new javax.swing.ImageIcon(
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
				if (x1 == 390 && y1 == 170) {
					if (f2 == 0) {
						int res = JOptionPane.showConfirmDialog(null, "是否购买房子",
								"购买房子", JOptionPane.YES_NO_OPTION);
						if (res == JOptionPane.YES_OPTION) {
							m1 = m1 - 300;
							jLabel51.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel5.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/img/图层8.1.png")));
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
								jLabel51.setIcon(new javax.swing.ImageIcon(
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
								jLabel51.setIcon(new javax.swing.ImageIcon(
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
				if (x1 == 470 && y1 == 170) {
					if (f3 == 0) {
						int res = JOptionPane.showConfirmDialog(null, "是否购买房子",
								"购买房子", JOptionPane.YES_NO_OPTION);
						if (res == JOptionPane.YES_OPTION) {
							m1 = m1 - 300;
							jLabel52.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel6.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/img/图层8.1.png")));
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
								jLabel52.setIcon(new javax.swing.ImageIcon(
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
								jLabel52.setIcon(new javax.swing.ImageIcon(
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
				if (x1 == 550 && y1 == 250) {
					if (f4 == 0) {
						int res = JOptionPane.showConfirmDialog(null, "是否购买房子",
								"购买房子", JOptionPane.YES_NO_OPTION);
						if (res == JOptionPane.YES_OPTION) {
							m1 = m1 - 300;
							jLabel53.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel8.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/img/图层8.1.png")));
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
								jLabel53.setIcon(new javax.swing.ImageIcon(
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
								jLabel53.setIcon(new javax.swing.ImageIcon(
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
				if (x1 == 550 && y1 == 330) {
					if (f5 == 0) {
						int res = JOptionPane.showConfirmDialog(null, "是否购买房子",
								"购买房子", JOptionPane.YES_NO_OPTION);
						if (res == JOptionPane.YES_OPTION) {
							m1 = m1 - 300;
							jLabel54.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel9.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/img/图层8.1.png")));
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
								jLabel54.setIcon(new javax.swing.ImageIcon(
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
								jLabel54.setIcon(new javax.swing.ImageIcon(
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
				if (x1 == 470 && y1 == 490) {
					if (f6 == 0) {
						int res = JOptionPane.showConfirmDialog(null, "是否购买房子",
								"购买房子", JOptionPane.YES_NO_OPTION);
						if (res == JOptionPane.YES_OPTION) {
							m1 = m1 - 300;
							jLabel55.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel12.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/img/图层8.1.png")));
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
								jLabel55.setIcon(new javax.swing.ImageIcon(
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
								jLabel55.setIcon(new javax.swing.ImageIcon(
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
				if (x1 == 390 && y1 == 490) {
					if (f7 == 0) {
						int res = JOptionPane.showConfirmDialog(null, "是否购买房子",
								"购买房子", JOptionPane.YES_NO_OPTION);
						if (res == JOptionPane.YES_OPTION) {
							m1 = m1 - 300;
							jLabel56.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel13.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/img/图层8.1.png")));
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
								jLabel56.setIcon(new javax.swing.ImageIcon(
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
								jLabel56.setIcon(new javax.swing.ImageIcon(
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
				if (x1 == 230 && y1 == 490) {
					if (f8 == 0) {
						int res = JOptionPane.showConfirmDialog(null, "是否购买房子",
								"购买房子", JOptionPane.YES_NO_OPTION);
						if (res == JOptionPane.YES_OPTION) {
							m1 = m1 - 300;
							jLabel57.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel15.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/img/图层8.1.png")));
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
								jLabel57.setIcon(new javax.swing.ImageIcon(
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
								jLabel57.setIcon(new javax.swing.ImageIcon(
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
				if (x1 == 150 && y1 == 410) {
					if (f9 == 0) {
						int res = JOptionPane.showConfirmDialog(null, "是否购买房子",
								"购买房子", JOptionPane.YES_NO_OPTION);
						if (res == JOptionPane.YES_OPTION) {
							m1 = m1 - 300;
							jLabel58.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel17.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/img/图层8.1.png")));
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
								jLabel58.setIcon(new javax.swing.ImageIcon(
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
								jLabel58.setIcon(new javax.swing.ImageIcon(
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
				if (x1 == 150 && y1 == 250) {
					if (f10 == 0) {
						int res = JOptionPane.showConfirmDialog(null, "是否购买房子",
								"购买房子", JOptionPane.YES_NO_OPTION);
						if (res == JOptionPane.YES_OPTION) {
							m1 = m1 - 300;
							jLabel59.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/images/Lv1.png")));
							jLabel19.setIcon(new javax.swing.ImageIcon(
									getClass().getResource("/img/图层8.1.png")));
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
								jLabel59.setIcon(new javax.swing.ImageIcon(
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
								jLabel59.setIcon(new javax.swing.ImageIcon(
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
				 * 随机事件格子
				 */
				if (x1 == 550 && y1 == 170) {
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

				if (x1 == 150 && y1 == 330) {
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
				 * 抽卡
				 */
				if (x1 == 550 && y1 == 490) {
					Random c = new Random();
					int card = c.nextInt(2);
					if (card1 == 0) {
						card1 = card + 1;
						JOptionPane.showMessageDialog(null, "获得贿赂卡", "抽卡",
								JOptionPane.CANCEL_OPTION);

					} else if (card2 == 0) {
						card2 = card + 1;
						JOptionPane.showMessageDialog(null, "获得随机卡", "抽卡",
								JOptionPane.CANCEL_OPTION);

					} else if (card3 == 0) {
						card3 = card + 1;
						JOptionPane.showMessageDialog(null, "获得赦免卡", "抽卡",
								JOptionPane.CANCEL_OPTION);

					} else {
						JOptionPane.showMessageDialog(null, "最多只能拥有三张卡片", "抽卡",
								JOptionPane.CANCEL_OPTION);

					}

				}
				/*
				 * 加钱格子
				 */
				if (x1 == 150 && y1 == 490) {
					m1 = m1 + 300;
					JOptionPane.showMessageDialog(null, "在宫中逛宫，捡到300文钱",
							"随机事件", JOptionPane.CANCEL_OPTION);
				}
				/*
				 * 暂停格子
				 */
				if (x1 == 310 && y1 == 490) {
					s1 = 1;
					JOptionPane.showMessageDialog(null, "摔伤了，下回合停止移动", "随机事件",
							JOptionPane.CANCEL_OPTION);
				}
				/*
				 * 扣钱格子
				 */
				if (x1 == 310 && y1 == 170) {
					m1 = m1 - 100;
					JOptionPane.showMessageDialog(null, "在宫中做错了事，被罚100文钱",
							"随机事件", JOptionPane.CANCEL_OPTION);

				}
				jTextField1.setText(Integer.toString(m1));
				jTextField2.setText(Integer.toString(m2));
				jTextField3.setText(Integer.toString(m3));
				order = 2;
			} else if (s1 == 1) {
				s1 = s1 - 1;
				JOptionPane.showMessageDialog(null, "停止一回合", "提示",
						JOptionPane.CANCEL_OPTION);
				order = 2;
			}
		case 2:
			if (s2 == 0) {
				Pl2 a = new Pl2();
				Thread d = new Thread(a) ;
				d.start();
				order = 3;
			} else if (s2 == 1) {
				s2 = s2 - 1;
				order = 3;
			}
		case 3:
			if (s3 == 0) {
				Pl3 b = new Pl3();
				Thread d = new Thread(b) ;
				d.start();
				order = 1;
			} else if (s3 == 1) {
				s3 = s3 - 1;
				order = 1;
			}

		}// switch

		
	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		new Card3View().setVisible(true);
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		int res = JOptionPane.showConfirmDialog(null, "是否退出游戏？进度将不会保存!",
				"退出游戏", JOptionPane.YES_NO_OPTION);
		if (res == JOptionPane.YES_OPTION) {
			new CMap().setVisible(true);
			this.dispose();
		} else {
			return;
		}
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Map3View().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
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
	private javax.swing.JLabel jLabel24;
	private javax.swing.JLabel jLabel25;
	private javax.swing.JLabel jLabel26;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
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
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	// End of variables declaration//GEN-END:variables

}