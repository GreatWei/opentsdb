/* This file was generated by /home/zhang/Desktop/opentsdb-2.4.1/build-aux/gen_build_data.sh.  Do not edit manually.  */
package net.opentsdb.tools;

/** Build data for {@code net.opentsdb.tools} */
public final class BuildData {
  /** Version string MAJOR.MINOR.MAINT */
  public static final String version = "BuildData";
  /** Short revision at which this package was built. */
  public static final String short_revision = "";
  /** Full revision at which this package was built. */
  public static final String full_revision = "";
  /** UTC date at which this package was built. */
  public static final String date = "2022/04/21 02:30:44 +0000";
  /** UNIX timestamp of the time of the build. */
  public static final long timestamp = 1650508244;

  /** Represents the status of the repository at the time of the build. */
  public static enum RepoStatus {
    /** The status of the repository was unknown at the time of the build. */
    UNKNOWN,
    /** There was no local modification during the build. */
    MINT,
    /** There were some local modifications during the build. */
    MODIFIED;
  }
  /** Status of the repository at the time of the build. */
  public static final RepoStatus repo_status = RepoStatus.MODIFIED;

  /** Username of the user who built this package. */
  public static final String user = "zhang";
  /** Host on which this package was built. */
  public static final String host = "ubuntu";
  /** Path to the repository in which this package was built. */
  public static final String repo = "/home/zhang/Desktop/opentsdb-2.4.1";
  /** Git branch */
  public static final String branch = "";

  /** Human readable string describing the revision of this package. */
  public static final String revisionString() {
    return "net.opentsdb.tools BuildData built at revision  (MODIFIED)";
  }
  /** Human readable string describing the build information of this package. */
  public static final String buildString() {
    return "Built on 2022/04/21 02:30:44 +0000 by zhang@ubuntu:/home/zhang/Desktop/opentsdb-2.4.1";
  }

  // These functions are useful to avoid cross-jar inlining.

  /** Version string MAJOR.MINOR.MAINT */
  public static String version() {
    return version;
  }
  /** Short revision at which this package was built. */
  public static String shortRevision() {
    return short_revision;
  }
  /** Full revision at which this package was built. */
  public static String fullRevision() {
    return full_revision;
  }
  /** UTC date at which this package was built. */
  public static String date() {
    return date;
  }
  /** UNIX timestamp of the time of the build. */
  public static long timestamp() {
    return timestamp;
  }
  /** Status of the repository at the time of the build. */
  public static RepoStatus repoStatus() {
    return repo_status;
  }
  /** Username of the user who built this package. */
  public static String user() {
    return user;
  }
  /** Host on which this package was built. */
  public static String host() {
    return host;
  }
  /** Path to the repository in which this package was built. */
  public static String repo() {
    return repo;
  }

  // Can't instantiate.
  private BuildData() {}

  public static void main(String[] args) {
    System.out.println(revisionString());
    System.out.println(buildString());
  }
}
