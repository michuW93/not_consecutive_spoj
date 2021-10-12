import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        TaskA.InputReader in = new TaskA.InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskA solver = new TaskA();
        solver.solve(in, out);
        out.close();
    }

    static class TaskA {
        public void solve(InputReader sc, PrintWriter writer) {
            getNotConsecutive(sc.nextInt(), writer);
        }

        public static void getNotConsecutive(int n, PrintWriter writer) {
            int mid;

            if (n == 0) {
                writer.print("0");
            } else if (n <= 2) {
                writer.print("NIE");
            } else if(n ==3 ){
                writer.print("2 0 3 1");
            } else {

                mid = n / 2;

                if (n % 2 == 0) {
                    for (int i = 0; i < mid; i++) {
                        writer.print(String.format("%d %d",i, (mid + i + 1)));
                        if (i != mid) {
                            writer.print(" ");
                        }
                    }
                    writer.print(mid);

                } else {
                    for (int i = 0; i <= mid; i++) {
                        writer.print(String.format("%d %d",i, (mid + i + 1)));
                        if (i != mid) {
                            writer.print(" ");
                        }
                    }
                }
            }
        }

            static class InputReader {
                private InputStream stream;
                private byte[] buf = new byte[1024];
                private int curChar;
                private int numChars;
                private InputReader.SpaceCharFilter filter;

                public InputReader(InputStream stream) {
                    this.stream = stream;
                }

                public int read() {
                    if (numChars == -1) {
                        throw new InputMismatchException();
                    }

                    if (curChar >= numChars) {
                        curChar = 0;
                        try {
                            numChars = stream.read(buf);
                        } catch (IOException e) {
                            throw new InputMismatchException();
                        }

                        if (numChars <= 0) {
                            return -1;
                        }
                    }
                    return buf[curChar++];
                }

                public int nextInt() {
                    int c = read();

                    while (isSpaceChar(c)) {
                        c = read();
                    }

                    int sgn = 1;

                    if (c == '-') {
                        sgn = -1;
                        c = read();
                    }

                    int res = 0;
                    do {
                        if (c < '0' || c > '9') {
                            throw new InputMismatchException();
                        }
                        res *= 10;
                        res += c - '0';
                        c = read();
                    } while (!isSpaceChar(c));

                    return res * sgn;
                }

                public long nextLong() {
                    int c = read();
                    while (isSpaceChar(c)) {
                        c = read();
                    }
                    int sgn = 1;
                    if (c == '-') {
                        sgn = -1;
                        c = read();
                    }
                    long res = 0;

                    do {
                        if (c < '0' || c > '9') {
                            throw new InputMismatchException();
                        }
                        res *= 10;
                        res += c - '0';
                        c = read();
                    } while (!isSpaceChar(c));
                    return res * sgn;
                }

                public String readString() {
                    int c = read();
                    while (isSpaceChar(c)) {
                        c = read();
                    }
                    StringBuilder res = new StringBuilder();
                    do {
                        res.appendCodePoint(c);
                        c = read();
                    } while (!isSpaceChar(c));

                    return res.toString();
                }

                public boolean isSpaceChar(int c) {
                    if (filter != null) {
                        return filter.isSpaceChar(c);
                    }
                    return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
                }

                public String next() {
                    return readString();
                }

                public interface SpaceCharFilter {
                    public boolean isSpaceChar(int ch);
                }
            }
        }
    }


//4
//0 2 4 1 3